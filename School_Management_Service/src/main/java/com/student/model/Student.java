package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCHOOL_MANAGEMENT_SERVICE")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
	private String name;
	private int age;
	private String course;
	private double fee;
	private String address;
	
	public Student() {
		super();
	}

	public Student(long sid, String name, int age, String course, double fee, String address) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.course = course;
		this.fee = fee;
		this.address = address;
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDetails [sid=" + sid + ", name=" + name + ", age=" + age + ", course=" + course + ", fee=" + fee
				+ ", address=" + address + "]";
	}
	
}//class
