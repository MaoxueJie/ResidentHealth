package com.breeze.health.cache;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SmsCache {
	private static Logger logger = LoggerFactory.getLogger(SmsCache.class);
	
	private static Map<String,List<Object>> smsCache=new HashMap<String, List<Object>>();
	
	static{
	   new Thread(){
			@Override
			public void run() {
				while(true)
				{
					try{
						clear();
						Thread.sleep(300000);
					}catch(Exception e)
					{
						logger.error("清理sms缓存异常", e);
					}
				}
			}   
	   }.start();
	}
	
	public synchronized static void put(String key,String value){
		List<Object> valueList = new ArrayList<Object>();
		valueList.add(value);
		valueList.add(new Date().getTime());
		smsCache.put(key, valueList);
	}
	
	public synchronized static String get(String key){
		if (smsCache.containsKey(key))
		{
			List<Object> valueList = smsCache.get(key);
			if (valueList!=null)
			{
				if (valueList.size()==2)
				{
					Long sendDate = (Long)valueList.get(1);
					Long now = new Date().getTime();
					
					if ((now-sendDate)/1000 > 1200)
					{
						smsCache.remove(key);
					}else
					{
						return (String)valueList.get(0);
					}
				}else
					smsCache.remove(key);
			}
		}
		return null;
	}
	
	private synchronized static void clear(){
		Iterator<Map.Entry<String, List<Object>>> it = smsCache.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, List<Object>> entry = it.next();
			List valueList = (List)entry.getValue();
			if (valueList!=null)
			{
				if (valueList.size()==2)
				{
					Long sendDate = (Long)valueList.get(1);
					Long now = new Date().getTime();
					
					if ((now-sendDate)/1000 > 1200)
					{
						it.remove();
					}
				}else
					it.remove();
			}
		}
	}
}
