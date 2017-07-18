package com.hyw.article.collect.mapper;

import java.util.List;
import java.util.Map;

import com.hyw.article.collect.model.Article;

public interface ArticleMapper {
   
	/**
	 * 条件查询文章
	 * @param input
	 * @return
	 */
	List<Article> selectArticleList(Map<String, String> input);
}