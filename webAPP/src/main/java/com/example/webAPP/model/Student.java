package com.example.webAPP.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Student {
	
	@Id
	private Integer id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToMany(targetEntity=Telephone.class,cascade = CascadeType.ALL,mappedBy = "student")
	//@JoinColumn(name = "id")
	List<Telephone> telephones;

	
	public List<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}

	public Integer getId() {
		return id;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
