package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.AnswerService;
import com.example.service.QuestionService;


@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService ;
	
	@Autowired
	private AnswerService answerService ;
	
	@GetMapping("/ques")
	public String ques(ModelMap modelMap) {
		modelMap.put("questions", questionService.findAll());
		modelMap.put("answers",answerService.findAll());
		return "question";
	}
}
