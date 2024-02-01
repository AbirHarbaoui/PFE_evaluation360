package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Question;

@Repository("questionRepository")
public interface QuestionRepository extends CrudRepository<Question,Integer>{

}
