package com.example.test.testservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {
	
	@Id
	@GeneratedValue
	private int rollno;
	@Column(name="STUDENT_NAME")
	private String name;
	@Column(name="STUDENT_COURSE")
	private String course;
	@Column(name="STUDENT_PER")
	private double percentage;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	} 
}
