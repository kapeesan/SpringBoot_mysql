package com.example.webAPP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telephone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;
	private String type;
	private String number;
	@ManyToOne
	@JoinColumn(name = "id",referencedColumnName = "id",insertable = false, updatable = false)
	private Student student;
	
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	

}
