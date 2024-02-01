package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Answer;
import com.example.repository.AnswerRepository;



@Service("answerService")
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepository ;
	
	
	@Override
	public Iterable<Answer> findAll() {
		return answerRepository.findAll();
	}

}
