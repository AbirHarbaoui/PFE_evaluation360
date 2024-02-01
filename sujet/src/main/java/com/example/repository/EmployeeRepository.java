package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Login;


// hedha tebaa affich liste
@Repository
public interface EmployeeRepository extends JpaRepository<Login, Long>{

 
}