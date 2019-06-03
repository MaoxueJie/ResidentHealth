package com.breeze.health.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.breeze.health.WebApplicationStarter;
import com.breeze.health.config.Config;
import com.breeze.health.config.WexinConfig;
import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.beans.weixin.resp.Article;
import com.breeze.health.beans.weixin.resp.NewsMessage;
import com.breeze.health.beans.weixin.resp.TextMessage;
import com.breeze.health.mapper.UserMapper;
import com.breeze.health.service.UserService;
import com.breeze.health.util.DesUtil;
import com.breeze.health.util.RequestUtils;
import com.breeze.health.util.SignUtil;
import com.breeze.health.util.wexin.WechatMessageUtil;


@Controller
@SuppressWarnings("all")
public class WexinController {
	private static Logger logger = LoggerFactory.getLogger(WexinController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/wechat", method = RequestMethod.GET)
	public void wechatService(
			PrintWriter out,
			HttpServletResponse response,
			@RequestParam(value = "signature", required = false) String signature,
			@RequestParam String timestamp, @RequestParam String nonce,
			@RequestParam String echostr) {
		logger.info("--------Start!----------");
		if (SignUtil.checkSignature(signature, timestamp, nonce,WexinConfig.getToken())) {
			out.print(echostr);
		}
		logger.info("--------End!----------");

	}

	@RequestMapping(value = "/wechat", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	public void wechatServicePost(HttpServletRequest request,
			HttpServletResponse response) {
		try{
			request.setCharacterEncoding("UTF-8"); 
			response.setCharacterEncoding("UTF-8");
			
			logger.info("--------Start!----------");
	
			Map<String, String> map = WechatMessageUtil.xmlToMap(request);
			String respContent = "未知的消息类型！";
			String MSGType=WechatMessageUtil.MESSAGE_TEXT;
			
			String qrCodeId="";
			
			logger.info(JSON.toJSONString(map));
			// 发送方帐号（一个OpenID）
			String fromUserName = map.get("FromUserName");
			// 开发者微信号
			String toUserName = map.get("ToUserName");
			// 消息类型
			String msgType = map.get("MsgType");
			// 默认回复一个"success"
			String responseMessage = "";
			
			TextMessage textMessage = new TextMessage();
			textMessage.setMsgType(MSGType);
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(System.currentTimeMillis());
			textMessage.setFuncFlag(0);
	
			// 文本消息
			if (WechatMessageUtil.MESSAGE_TEXT.equals(msgType)) {// 文本消息
				respContent = "您发送的是文本消息！";
			}
			// 图片消息
			else if (WechatMessageUtil.MESSAtGE_IMAGE.equals(msgType)) {
				respContent = "您发送的是图片消息！";
			}
			// 语音消息
			else if (WechatMessageUtil.MESSAGE_VOICE.equals(msgType)) {
				respContent = "您发送的是语音消息！";
			}
			// 图文消息
			else if (WechatMessageUtil.MESSAGE_NEWS.equals(msgType)) {
				respContent = "您发送的是图文消息！";
			}
			// 视频消息
			else if (WechatMessageUtil.MESSAGE_VIDEO.equals(msgType)) {
				respContent = "您发送的是视频消息！";
			}
			// 小视频消息
			else if (WechatMessageUtil.MESSAGE_SHORTVIDEO.equals(msgType)) {
				respContent = "您发送的是小视频消息！";
			}
			// 地理位置消息
			else if (WechatMessageUtil.MESSAGE_LOCATION.equals(msgType)) {
				respContent = "您发送的是地理位置消息！";
			}
			// 链接消息
			else if (WechatMessageUtil.MESSAGE_LINK.equals(msgType)) {
				respContent = "您发送的是链接消息！";
			}
			// 事件推送
			else if (WechatMessageUtil.MESSAGE_EVENT.equals(msgType)) {
				// 事件类型
				String eventType = map.get("Event");
				// 关注
				if (eventType.equals(WechatMessageUtil.MESSAGE_EVENT_SUBSCRIBE)) {
					String eventKey = map.get("EventKey");
					if (!"".equals(eventKey)) {
						qrCodeId = eventKey.split("qrscene_")[1];
					} else {
						respContent = "您好！感谢您关注“居民e健康”。“居民e健康”公众号是北京大学护理学院孙宏玉教授团队与多所高校和医疗机构的专家学者合作搭建的居民健康监测与管理平台，为广大居民提供健康管理服务，帮助居民更好地管理自己的健康。为了能更准确地进行健康监测和做出全面的健康报告，需要您填写或上传相关的健康信息。您的所有信息都可以得到安全保障，不会泄露给本团队以外的任何个人和第三方机构。";
					}
					userService.bindWexin(fromUserName,null);
				}
				// 取消关注
				else if (eventType
						.equals(WechatMessageUtil.MESSAGE_EVENT_UNSUBSCRIBE)) {
					// TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
					userService.unbindWexin(fromUserName);
				}
	
				// 扫描带参数二维码
				if (eventType.equals(WechatMessageUtil.MESSAGE_EVENT_SCAN)) {
					//doc_infomation=true;
					qrCodeId = map.get("EventKey");
				}
				// 上报地理位置
				else if (eventType
						.equals(WechatMessageUtil.MESSAGE_EVENT_LOCATION_UP)) {
					// TODO 处理上报地理位置事件
				}
				// 自定义菜单
				else if (eventType.equals(WechatMessageUtil.MESSAGE_EVENT_CLICK)) {
					
				}
			}
			if (!StringUtils.isEmpty(respContent))
			{
				textMessage.setContent(respContent);
				responseMessage = WechatMessageUtil.textMessageToXml(textMessage);
			}
			logger.info(responseMessage);
			
			response.getWriter().print(responseMessage);
			response.getWriter().flush();
		}catch(Exception e)
		{
			logger.error("",e);
		}
		logger.info("--------End!----------");

	}
	
	@RequestMapping(value = "/wechatMenu/{menuId}", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView verifyToken1(HttpServletRequest request, HttpServletResponse response,@PathVariable String menuId) throws IOException {
		logger.info("memu=="+menuId);

		String appId= WexinConfig.getAppid();
		
		String oauthUrl = Config.getBasepath()+"wechat/oauth";
		
		String redirectUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + appId + "&redirect_uri="
				+ oauthUrl + "&response_type=code&scope=snsapi_base&state=" + menuId + "&connect_redirect=1#wechat_redirect";
		logger.info("redirectUrl=="+redirectUrl);
		
		return new ModelAndView(new RedirectView(redirectUrl));
	}
	
	@RequestMapping(value = "/wechat/oauth", method = RequestMethod.GET)
	public ModelAndView weixinOAuth(HttpServletRequest request, HttpServletResponse response, Model model) {
		String code = request.getParameter("code");
		String state = request.getParameter("state");

		String appid = WexinConfig.getAppid();
		String secret =WexinConfig.getAppsecret();

		String URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code"
				.replace("APPID", appid).replace("SECRET", secret).replace("CODE", code);
		
		HttpClient client = new HttpClient();
		GetMethod get = new GetMethod(URL);
		String responseBady = "";
		try {
			client.executeMethod(get);
			responseBady = get.getResponseBodyAsString();
		} catch (HttpException e) {
			logger.error("http exception",e);
		} catch (IOException e) {
			logger.error("io exception",e);
		}
		String path = Config.getBasepath();
		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(responseBady);
			logger.info(jsonObj.toString());
			UserVo user = (UserVo)request.getSession().getAttribute("user");
			String parm="timestamp="+System.currentTimeMillis();
			if (jsonObj.has("openid"))
			{
				String openid = jsonObj.get("openid").toString();
				request.getSession().setAttribute("openid", openid);

				if (user==null){
					user = userService.getUserByOpenId(openid).getData();
					request.getSession().setAttribute("user",user);
				}
				if (user!=null) {
					userService.bindWexin(openid,user.getId());
					String token = DesUtil.encrypt(user.getId()+"");
					RequestUtils.setCookie(request, response, "Authentication",token, 1800);
					parm += "&token="+token;
				}
			}

			String url="";
			if (user!=null)
			{
				
				if (userService.getBaseInfo(user.getId()).getData()!=null){
					if ("base".equals(state)) {
						url=path+"static/base.html?"+parm;
					}else if ("report".equals(state)) {
						url=path+"static/report.html?"+parm;
					}else if ("living".equals(state)) {
						url=path+"static/living.html?"+parm;
					}else if ("sick".equals(state)) {
						url=path+"static/sick.html?"+parm;
					}else if ("phy".equals(state)) {
						url=path+"static/phy.html?"+parm;
					}else if ("psy".equals(state)) {
						url=path+"static/psy.html?"+parm;
					}else if ("tcm".equals(state)) {
						url=path+"static/tcm.html?"+parm;
					}
				}else if(!"base".equals(state))
				{
					url=path+"static/skip.html?"+parm+"&state="+state;
				}else if("base".equals(state))
				{
					url=path+"static/base.html?"+parm;
				}
			}else
			{
				url=path+"static/login.html?"+parm+"&state="+state;
			}
			logger.info("redirect="+url);
			return new ModelAndView(new RedirectView(url));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
}
