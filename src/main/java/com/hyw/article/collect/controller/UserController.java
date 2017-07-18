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

@RequestMapping("/api/user")
@Controller("/api/user")
public class UserController {
	
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/validate")
	public String validate(String password, Model model) {
		
		Map<String, String> input = new HashMap<>();
		List<Article> list = articleService.selectArticleList(input);
		model.addAttribute("list", list);
		return "success！";
	}
}
