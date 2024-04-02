package com.aloofly.studentcrudapi.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aloofly.studentcrudapi.controller.IStudentController;
import com.aloofly.studentcrudapi.model.Student;
import com.aloofly.studentcrudapi.service.IStudentService;

@Component
public class StudentControllerImpl implements IStudentController{

	@Autowired
	IStudentService service;
	
	@Override
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}

	@Override
	public void deleteStudentBYId(int id) {
		service.deleteStudentById(id);
		
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
