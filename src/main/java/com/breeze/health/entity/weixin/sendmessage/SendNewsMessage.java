package com.breeze.health.entity.weixin.sendmessage;

import java.util.List;

import com.breeze.health.entity.weixin.resp.Article;


/**
 * 图文消息
 * 
 */
public class SendNewsMessage extends BaseSendMessage {
	// 多条图文消息信息，默认第一个item为大图,图文消息条数限制在8条以内
	private List<Article> news;

	public List<Article> getNews() {
		return news;
	}

	public void setNews(List<Article> news) {
		this.news = news;
	}

}
