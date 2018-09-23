package com.breeze.health.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>Title: BeanUtils.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company:www.liequ.cn</p>
 * @author jiemaoxue@yourmall.com
 * @date 2018年1月11日
 */
public class BeanUtils<T,K> {
	private Class<K> cla;
	
	public BeanUtils(Class<K> cla){
		this.cla = cla;
	}
	
	public static void copyProperties(Object source,Object dest)
	{
		org.springframework.beans.BeanUtils.copyProperties(source, dest);
	}

	public static <T,K>  BeanUtils<T,K> createTrans(Class<T> clat,Class<K> clak){
		return new BeanUtils<T,K>(clak);
	}
	
	public void copyProperties(List<T> source,List<K> dest) throws Exception{
		if (source!=null && dest != null)
		{
			Iterator<T> it = source.iterator();
			while(it.hasNext())
			{
				Object obj = it.next();
				K t = cla.newInstance();
				org.springframework.beans.BeanUtils.copyProperties(obj, t);
				dest.add(t);
			}
		}
	}
	
	public void copyProperties(List<T> source,List<K> dest,BeanProcessor<T,K> processor) throws Exception{
		if (source!=null && dest != null)
		{
			Iterator<T> it = source.iterator();
			while(it.hasNext())
			{
				T obj = it.next();
				K t = cla.newInstance();
				org.springframework.beans.BeanUtils.copyProperties(obj, t);
				boolean process = true;
				if (processor!=null)
					process = processor.process(obj, t);
				if (process)
					dest.add(t);
			}
		}
	}
	
	public interface BeanProcessor<T,K>{
		 boolean process(T source,K dest);
	}
}
