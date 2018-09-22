package com.breeze.health.beans.weixin.resp;

public class TextMessage extends BaseMessage {
	/**
	 * 文本消息内容
	 */
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
