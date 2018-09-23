package com.breeze.health.util.wexin;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.breeze.health.util.HttpUtils;

public class MenuUtil {
    private static Logger log = LoggerFactory.getLogger(MenuUtil.class);
    // 获取token（GET）
    public static final String GET_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token";
    // 菜单创建（POST）
    public final static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    // 菜单查询（GET）
    public final static String menu_get_url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
    // 菜单删除（GET）
    public final static String menu_delete_url = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";

    /**
     * 创建菜单
     *
     * @param menu        菜单实例
     * @param accessToken 凭证
     * @return true成功 false失败
     */
    public static boolean createMenu(Menu menu, String accessToken) {
        boolean result = false;
        String url = menu_create_url.replace("ACCESS_TOKEN", accessToken);
        // 将菜单对象转换成json字符串
        String jsonMenu = JSONObject.toJSONString(menu);
        System.out.println(jsonMenu);
        // 发起POST请求创建菜单
        JSONObject jsonObject = HttpUtils.httpsRequest(url, "POST", jsonMenu);
        System.out.println("errcode======="+jsonObject.get("errcode").toString());
        if (null != jsonObject) {
            int errorCode = jsonObject.getInteger("errcode");
            String errorMsg = jsonObject.getString("errmsg");
            if (0 == errorCode) {
                result = true;
            } else {
                result = false;
                log.error("创建菜单失败 errcode:{} errmsg:{}", errorCode, errorMsg);
            }
        }
        return result;
    }

    /**
     * 查询菜单
     *
     * @param accessToken 凭证
     * @return
     */
    public static String getMenu(String accessToken) {
        String result = null;
        String requestUrl = menu_get_url.replace("ACCESS_TOKEN", accessToken);
        // 发起GET请求查询菜单
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, "GET", null);

        if (null != jsonObject) {
            result = jsonObject.toString();
        }
        return result;
    }

    /**
     * 删除菜单
     *
     * @param accessToken 凭证
     * @return true成功 false失败
     */
    public static boolean deleteMenu(String accessToken) {
        boolean result = false;
        String requestUrl = menu_delete_url.replace("ACCESS_TOKEN", accessToken);
        // 发起GET请求删除菜单
        JSONObject jsonObject = HttpUtils.httpsRequest(requestUrl, "GET", null);

        if (null != jsonObject) {
            int errorCode = jsonObject.getInteger("errcode");
            String errorMsg = jsonObject.getString("errmsg");
            if (0 == errorCode) {
                result = true;
            } else {
                result = false;
                log.error("删除菜单失败 errcode:{} errmsg:{}", errorCode, errorMsg);
            }
        }
        return result;
    }
    
    public static String getWXToken(String url, String appid, String secret) {
		String turl = String.format(
				"%s?grant_type=client_credential&appid=%s&secret=%s", url,
				appid, secret);
		
		JSONObject jsonObject = HttpUtils.httpsRequest(turl, "GET", null);
		if (null != jsonObject) {
            return jsonObject.getString("access_token");
        }
		return null;
	}
    
    private static void createMenu(){
    	
    	String path = "http://9vk892.natappfree.cc";
    	
    	Menu menu = new Menu();
    	ComplexButton[] buttons = new ComplexButton[3];
    	ComplexButton button1 = new ComplexButton();
    	button1.setName("健康监测");
    	button1.setType("view");
    	ComplexButton[] subbs1 = new ComplexButton[4];
    	ComplexButton b1 = new ComplexButton();
    	b1.setName("生活习惯");
    	b1.setType("view");
    	b1.setSub_button(new ComplexButton[0]);
    	b1.setUrl(path+"/wechatMenu/living");
    	subbs1[0] = b1;
    	ComplexButton b2 = new ComplexButton();
    	b2.setName("生理指标");
    	b2.setType("view");
    	b2.setSub_button(new ComplexButton[0]);
    	b2.setUrl(path+"/wechatMenu/phy");
    	subbs1[1] = b2;
    	ComplexButton b3 = new ComplexButton();
    	b3.setName("情绪认知");
    	b3.setType("view");
    	b3.setSub_button(new ComplexButton[0]);
    	b3.setUrl(path+"/wechatMenu/psy");
    	subbs1[2] = b3;
    	ComplexButton b4 = new ComplexButton();
    	b4.setName("健康状况");
    	b4.setType("view");
    	b4.setSub_button(new ComplexButton[0]);
    	b4.setUrl(path+"/wechatMenu/sick");
    	subbs1[3] = b4;
    	button1.setSub_button(subbs1);
    	buttons[0] = button1;
    	
    	ComplexButton button2 = new ComplexButton();
    	button2.setName("健康宣教");
    	button2.setType("view");
    	ComplexButton[] subbs2 = new ComplexButton[4];
    	ComplexButton sb1 = new ComplexButton();
    	sb1.setName("生活");
    	sb1.setType("view");
    	sb1.setSub_button(new ComplexButton[0]);
    	sb1.setUrl("http://www.baidu.com");
    	subbs2[0] = sb1;
    	ComplexButton sb2 = new ComplexButton();
    	sb2.setName("心理");
    	sb2.setType("view");
    	sb2.setSub_button(new ComplexButton[0]);
    	sb2.setUrl("http://www.baidu.com");
    	subbs2[1] = sb2;
    	ComplexButton sb3 = new ComplexButton();
    	sb3.setName("慢病");
    	sb3.setType("view");
    	sb3.setSub_button(new ComplexButton[0]);
    	sb3.setUrl("http://www.baidu.com");
    	subbs2[2] = sb3;
    	ComplexButton sb4 = new ComplexButton();
    	sb4.setName("中医");
    	sb4.setType("view");
    	sb4.setSub_button(new ComplexButton[0]);
    	sb4.setUrl("http://www.baidu.com");
    	subbs2[3] = sb4;
    	button2.setSub_button(subbs2);
    	
    	buttons[1] = button2;
    	
    	ComplexButton button3 = new ComplexButton();
    	button3.setName("我的");
    	button3.setType("view");
    	ComplexButton[] subbs3 = new ComplexButton[2];
    	ComplexButton ssb1 = new ComplexButton();
    	ssb1.setName("基本信息");
    	ssb1.setType("view");
    	ssb1.setSub_button(new ComplexButton[0]);
    	ssb1.setUrl(path+"/wechatMenu/base");
    	subbs3[0] = ssb1;
    	ComplexButton ssb2 = new ComplexButton();
    	ssb2.setName("查看报告");
    	ssb2.setType("view");
    	ssb2.setSub_button(new ComplexButton[0]);
    	ssb2.setUrl(path+"/wechatMenu/report");
    	subbs3[1] = ssb2;
    	button3.setSub_button(subbs3);
    	buttons[2] = button3;
    	
    	menu.setButton(buttons);
    	createMenu(menu,getWXToken(GET_TOKEN_URL,"wx336e204e851303d6","34ab89470c9ea9e5d6e3fe00a76bfe9d"));
    }
    
    //{"menu":{"button":[{"name":"中心介绍","sub_button":[],"type":"view","url":"http://bjhc.tb360.org/h/introduce.html"},{"name":"推荐医生","sub_button":[],"type":"view","url":"http://bjhc.tb360.org/h/drIntro.html"},{"name":"个人中心","sub_button":[{"name":"我的基本信息","sub_button":[],"type":"view","url":"http://bjhc.tb360.org/wechatMenu/bx/BASEINFO"},{"name":"我的医生","sub_button":[],"type":"view","url":"http://bjhc.tb360.org/wechatMenu/bx/DOC"},{"name":"我的提问","sub_button":[],"type":"view","url":"http://bjhc.tb360.org/wechatMenu/bx/ASK"},{"name":"我的复诊","sub_button":[],"type":"view","url":"http://bjhc.tb360.org/wechatMenu/bx/VISIT"},{"name":"我的指标","sub_button":[],"type":"view","url":"http://bjhc.tb360.org/wechatMenu/bx/MEASURE"}]}]}}
    //public static void main(String args[])
    //{
    	//createMenu();
    //}
}