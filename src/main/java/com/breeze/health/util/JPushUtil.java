package com.breeze.health.util;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;

public class JPushUtil {

    private static final String appKey = "396299d2c931fce6152b9bdf";

    private static final String masterSecret = "23ce9f4bf503072db4696e9e";
    
    private final static Logger logger = LoggerFactory.getLogger(JPushUtil.class);

    private static JPushClient jpush = null;
    
    public static void jPushSendAsy(final String title ,final String message ,final String alias,final Long msgId) {
    	new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				jPushSend(title,message,alias,msgId);
			}
		}).start();
    }
    
    public static void jPushSend(String title ,String message ,String alias,Long msgId){
        logger.info("enter jPushSend.");
        jpush = new JPushClient(masterSecret, appKey);
        PushResult msgResult = null;
        try {
        	Map<String,String> extras = new HashMap<String,String>();
        	extras.put("msgId", msgId.toString());
        	msgResult = jpush.sendAndroidNotificationWithAlias(title, message, extras, alias);
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
        if (null != msgResult) {
            System.out.println(msgResult.getResponseCode());
        } else {
            System.out.println("无法获取数据");
        }
    }
}