package com.hyw.article.collect.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hyw.article.collect.mapper.ArticleMapper;
import com.hyw.article.collect.model.Article;
import com.hyw.article.collect.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public List<Article> selectArticleList(Map<String, String> input) {		
		return articleMapper.selectArticleList(input);
	}

}
