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
    /*
    public static void main(String args[])
    {
    	System.out.println(getMenu(getWXToken(GET_TOKEN_URL,"wx3774a353a41a61ee","fa8b10d65066444dd1f7ef7bbc133fcc")));
    }*/
}