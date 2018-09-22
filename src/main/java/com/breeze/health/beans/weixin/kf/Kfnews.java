package com.breeze.health.beans.weixin.kf;

import java.util.List;

import com.breeze.health.beans.weixin.resp.Article;



/**
 * 图文消息
 * 
 */
public class Kfnews extends Basebean {
	// 多条图文消息信息，默认第一个item为大图,图文消息条数限制在8条以内
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}


}
