package com.prashanthIt.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.prashanthIt.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Serializable> {

}
