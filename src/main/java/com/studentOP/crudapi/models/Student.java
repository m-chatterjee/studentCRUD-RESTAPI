package com.studentOP.crudapi.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.context.properties.ConstructorBinding;

@Entity(name = "StudentTable")
public class Student {
	@Id
	private long rollNo;
	private String name,phoneNo,email,college,stream;
	private int age;
	private double cgpa;
	private boolean isGraduated;
	
	
	public Student() {
		
	}
	public Student(long rollNo, String name, String phoneNo, String email, String college, String stream, int age,
			double cgpa, boolean isGraduated) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.college = college;
		this.stream = stream;
		this.age = age;
		this.cgpa = cgpa;
		this.isGraduated = isGraduated;
	}
	
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public boolean isGraduated() {
		return isGraduated;
	}
	public void setGraduated(boolean isGraduated) {
		this.isGraduated = isGraduated;
	}
	
	
	
}
