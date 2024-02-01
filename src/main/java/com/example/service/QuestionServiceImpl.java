package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Question;
import com.example.repository.QuestionRepository;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questionRepository ;
	
	
	@Override
	public Iterable<Question> findAll() {
		return questionRepository.findAll();
	}

}
