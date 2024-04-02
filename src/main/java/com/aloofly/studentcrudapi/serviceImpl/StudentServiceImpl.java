package com.aloofly.studentcrudapi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloofly.studentcrudapi.model.Student;
import com.aloofly.studentcrudapi.repository.IStudentRepository;
import com.aloofly.studentcrudapi.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	IStudentRepository repository;
	
	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudent=new ArrayList<Student>();
		repository.findAll().forEach(allStudent::add);
		return allStudent;
	}

	@Override
	public void deleteStudentById(int id) {
		repository.deleteById(id);
	}

	@Override
	public Student createStudent(Student student) {
		return repository.save(student);
	}

}
