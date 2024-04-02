package com.aloofly.studentcrudapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aloofly.studentcrudapi.model.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Integer>{

}
