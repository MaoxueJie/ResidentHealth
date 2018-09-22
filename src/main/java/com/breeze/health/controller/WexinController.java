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
import com.breeze.health.config.WexinConfig;
import com.breeze.health.entity.weixin.resp.Article;
import com.breeze.health.entity.weixin.resp.NewsMessage;
import com.breeze.health.entity.weixin.resp.TextMessage;
import com.breeze.health.mapper.UserMapper;
import com.breeze.health.util.SignUtil;
import com.breeze.health.util.wexin.WechatMessageUtil;


@Controller
public class WexinController {
	private static Logger logger = LoggerFactory.getLogger(WexinController.class);
	
	@Autowired
	UserMapper userMapper;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String index(){
		logger.info("_________________________________________________________" + WexinConfig.getAppid());
		logger.info("userMapper="+userMapper);
		return "hello world";
	}
	
	

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

	
	@ResponseBody
	@RequestMapping(value = "/wechat", method = RequestMethod.POST)
	public void wechatServicePost(PrintWriter out, HttpServletRequest request,
			HttpServletResponse response) {
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
					respContent = "谢谢您的关注！";
				}
				//WechatSubscribeService.processSubscribe(fromUserName, wx_pub, qrCodeId);
			}
			// 取消关注
			else if (eventType
					.equals(WechatMessageUtil.MESSAGE_EVENT_UNSUBSCRIBE)) {
				// TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
				//WechatSubscribeService.processUnsubscribe(fromUserName, wx_pub);
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

		logger.info(responseMessage);

		out.print(responseMessage);
		out.flush();
		logger.info("--------End!----------");

	}
	
	
	@RequestMapping(value = "/wechat/oauth", method = RequestMethod.GET)
	public ModelAndView weixinOAuth(HttpServletRequest request, HttpServletResponse response, Model model,
			@PathVariable String pubName) {
		// 寰楀埌code
		String CODE = request.getParameter("code");
		String state = request.getParameter("state");
		String wx_pub="";
		if("sinovo".equals(pubName)){
			wx_pub="0";
		}else if("bx".equals(pubName)){
			wx_pub="1";
		}else if("zjj".equals(pubName)){
			wx_pub="2";
		}

		String APPID = WexinConfig.getAppid();
		String SECRET =WexinConfig.getAppsecret();

		String URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code"
				.replace("APPID", APPID).replace("SECRET", SECRET).replace("CODE", CODE);
		
		HttpClient client = new HttpClient();
		GetMethod get = new GetMethod(URL);
		String responseBady = "";
		try {
			client.executeMethod(get);
			responseBady = get.getResponseBodyAsString();
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String NODEPATH = "";
		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(responseBady);
			String openid = jsonObj.get("openid").toString();

			String url="";
			
			
			String parm="openId="+openid+"&wx_pub="+wx_pub +"&timestamp="+System.currentTimeMillis();//鍙傛暟
			if(false){
				url=NODEPATH+"writeInfo?"+parm;
			}else{
				if ("test".equals(state)) {
					url = NODEPATH+"myDoctor?"+parm;
				} else if ("BASEINFO".equals(state)) {
					// 鎴戠殑鍩烘湰淇℃伅
					url = NODEPATH + "patientDetails?"+parm;
				} else if ("ASK".equals(state)) {
					// 鎴戠殑鎻愰棶
					url = NODEPATH + "askAnswerList?"+parm;
				} else if ("VISIT".equals(state)) {
					// 鎴戠殑澶嶈瘖
					url = NODEPATH + "reVisitList?"+parm;
				} else if ("MEASURE".equals(state)) {
					// 鎴戠殑鎸囨爣
					url = NODEPATH + "indexData?"+parm;
				} else if ("DOC".equals(state)) {
					// 鎴戠殑鍖荤敓
					url = NODEPATH+"myDoctor?"+parm;
				}else  if (false){//鍖荤敓涓汉涓婚〉
					
					url = NODEPATH+"drHomePage?"+parm+"&docId="+state+"&patientId=";
				}
			}

			return new ModelAndView(new RedirectView(url));

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
}
