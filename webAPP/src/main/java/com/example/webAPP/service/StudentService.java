package com.example.webAPP.service;

import com.example.webAPP.model.Student;

public interface StudentService {
	
	Student save(Student student);
	
	Student fetch();
	
	Student fetch(Student student);

}
