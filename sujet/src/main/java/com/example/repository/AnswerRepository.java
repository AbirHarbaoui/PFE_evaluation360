package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Answer;


@Repository("answerRepository")
public interface AnswerRepository extends CrudRepository<Answer,Integer>{

}
