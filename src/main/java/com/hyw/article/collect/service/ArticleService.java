package com.hyw.article.collect.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hyw.article.collect.model.Article;

@Service("articleService")
public interface ArticleService {

	/**
	 * 条件查询文章
	 * @param input
	 * @return
	 */
	List<Article> selectArticleList(Map<String, String> input);
}
