package com.hyw.article.collect.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyw.article.collect.model.Article;
import com.hyw.article.collect.service.ArticleService;

@RequestMapping("/api/article")
@Controller("/api/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/test")
	public String test(String title, String beginDate, String endDate, Model model) {
		
		Map<String, String> input = new HashMap<>();
		input.put("title", "%" + title + "%");		
		input.put("beginDate", beginDate);
		input.put("endDate", endDate);
		
		List<Article> list = articleService.selectArticleList(input);
		model.addAttribute("list", list);
		return "success！";
	}
}
