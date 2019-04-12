package com.example.webAPP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webAPP.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
