package com.breeze.health.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

public class HttpUtils {
	private static Logger log = LoggerFactory.getLogger(HttpUtils.class);
	public static JSONObject httpsRequest(String url, String method,
			String jsonParam) {
		String result = "";
		JSONObject json = null;
		HttpClient client = new DefaultHttpClient();
		if ("POST".equalsIgnoreCase(method))
		{
			HttpPost post = new HttpPost(url);
			
			try {
				StringEntity entity = new StringEntity(jsonParam, "utf-8");// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
				entity.setContentEncoding("UTF-8");
				entity.setContentType("application/json");
				post.setEntity(entity);
				HttpResponse httpResponse = client.execute(post);
				if (httpResponse.getStatusLine().getStatusCode() == 200) {
					HttpEntity he = httpResponse.getEntity();
					result = EntityUtils.toString(he, "UTF-8");// 取锟斤拷应锟斤拷锟街凤拷锟斤拷
					json = JSONObject.parseObject(result);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 锟截憋拷锟斤拷锟斤拷 ,锟酵凤拷锟斤拷源
				client.getConnectionManager().shutdown();
				return json;
			}
		}else if("GET".equalsIgnoreCase(method))
		{
			HttpGet get = new HttpGet(url);
			try {
				HttpResponse httpResponse = client.execute(get);
				if (httpResponse.getStatusLine().getStatusCode() == 200) {
					HttpEntity he = httpResponse.getEntity();
					result = EntityUtils.toString(he, "UTF-8");// 取锟斤拷应锟斤拷锟街凤拷锟斤拷
					json = JSONObject.parseObject(result);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 锟截憋拷锟斤拷锟斤拷 ,锟酵凤拷锟斤拷源
				client.getConnectionManager().shutdown();
				return json;
			}
		}
		return null;
	}
}
