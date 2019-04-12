package com.example.webAPP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webAPP.model.Student;
import com.example.webAPP.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student fetch(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
