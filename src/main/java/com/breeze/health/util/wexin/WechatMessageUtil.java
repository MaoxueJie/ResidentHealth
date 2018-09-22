package com.breeze.health.util.wexin;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import com.breeze.health.entity.weixin.resp.Article;
import com.breeze.health.entity.weixin.resp.MusicMessage;
import com.breeze.health.entity.weixin.resp.NewsMessage;
import com.breeze.health.entity.weixin.resp.TextMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class WechatMessageUtil {
	// 各种消息类型,除了扫带二维码事件
	/**
	 * 文本消息
	 */
	public static final String MESSAGE_TEXT = "text";
	/**
	 * 图片消息
	 */
	public static final String MESSAtGE_IMAGE = "image";
	/**
	 * 图文消息
	 */
	public static final String MESSAGE_NEWS = "news";
	/**
	 * 语音消息
	 */
	public static final String MESSAGE_VOICE = "voice";
	/**
	 * 视频消息
	 */
	public static final String MESSAGE_VIDEO = "video";
	/**
	 * 小视频消息
	 */
	public static final String MESSAGE_SHORTVIDEO = "shortvideo";
	/**
	 * 地理位置消息
	 */
	public static final String MESSAGE_LOCATION = "location";
	/**
	 * 链接消息
	 */
	public static final String MESSAGE_LINK = "link";
	/**
	 * 事件推送消息
	 */
	public static final String MESSAGE_EVENT = "event";
	/**
	 * 事件推送消息中,事件类型，subscribe(订阅)
	 */
	public static final String MESSAGE_EVENT_SUBSCRIBE = "subscribe";
	/**
	 * 事件推送消息中,事件类型，unsubscribe(取消订阅)
	 */
	public static final String MESSAGE_EVENT_UNSUBSCRIBE = "unsubscribe";

	/**
	 * 事件类型：scan(用户已关注时的扫描带参数二维码)
	 */
	public static final String MESSAGE_EVENT_SCAN = "SCAN";
	/**
	 * 事件推送消息中,上报地理位置事件
	 */
	public static final String MESSAGE_EVENT_LOCATION_UP = "LOCATION";
	/**
	 * 事件推送消息中,自定义菜单事件,点击菜单拉取消息时的事件推送
	 */
	public static final String MESSAGE_EVENT_CLICK = "CLICK";
	/**
	 * 事件推送消息中,自定义菜单事件,点击菜单跳转链接时的事件推送
	 */
	public static final String MESSAGE_EVENT_VIEW = "VIEW";

	/**
	 * 将xml转化为Map集合
	 * 
	 * @param request
	 * @return
	 */
	public static Map<String, String> xmlToMap(HttpServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		InputStream ins = null;
		try {
			ins = request.getInputStream();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Document doc = null;
		try {
			doc = reader.read(ins);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		Element root = doc.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> list = root.elements();
		for (Element e : list) {
			map.put(e.getName(), e.getText());
		}
		try {
			ins.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return map;
	}

	/**
	 * 文本消息转化为xml
	 * 
	 * @param textMessage
	 * @return
	 */
	public static String textMessageToXml(TextMessage textMessage) {
		xstream.alias("xml", textMessage.getClass());
		return xstream.toXML(textMessage);
	}

	/**
	 * 音乐消息对象转换成xml
	 * 
	 * @param musicMessage
	 *            音乐消息对象
	 * @return xml
	 */
	public static String musicMessageToXml(MusicMessage musicMessage) {
		xstream.alias("xml", musicMessage.getClass());
		return xstream.toXML(musicMessage);
	}

	/**
	 * 图文消息对象转换成xml
	 * 
	 * @param newsMessage
	 *            图文消息对象
	 * @return xml
	 */
	public static String newsMessageToXml(NewsMessage newsMessage) {
		xstream.alias("xml", newsMessage.getClass());
		xstream.alias("item", new Article().getClass());
		return xstream.toXML(newsMessage);
	}

	/**
	 * 扩展xstream，使其支持CDATA块
	 * 
	 * @date 2013-05-19
	 */
	private static XStream xstream = new XStream(new XppDriver() {
		public HierarchicalStreamWriter createWriter(Writer out) {
			return new PrettyPrintWriter(out) {
				// 对所有xml节点的转换都增加CDATA标记
				boolean cdata = true;

				@SuppressWarnings("unchecked")
				public void startNode(String name, Class clazz) {
					super.startNode(name, clazz);
				}

				protected void writeText(QuickWriter writer, String text) {
					if (cdata) {
						writer.write("<![CDATA[");
						writer.write(text);
						writer.write("]]>");
					} else {
						writer.write(text);
					}
				}
			};
		}
	});
}