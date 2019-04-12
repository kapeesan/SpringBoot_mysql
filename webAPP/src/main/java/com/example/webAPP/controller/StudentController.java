package com.example.webAPP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.webAPP.model.Student;
import com.example.webAPP.service.StudentService;

@RestController
@RequestMapping(value = "/smscloud")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/student" , method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		
		return studentService.save(student);
	}
	
	
}
