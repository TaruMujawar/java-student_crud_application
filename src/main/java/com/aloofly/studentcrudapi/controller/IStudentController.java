package com.aloofly.studentcrudapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloofly.studentcrudapi.model.Student;

@RestController
@RequestMapping("student")
public interface IStudentController {
	
	@GetMapping("all")
	List<Student> getAllStudent();
	
	@DeleteMapping("delete/{id}")
	void deleteStudentBYId(@PathVariable int id);
	
	@PostMapping("create")
	Student createStudent(Student student);
}
