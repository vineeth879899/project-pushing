package com.major_project.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentDetails")
public class StudentDataEntity {
	
	@Id
	private int id;
	private String name;
	private String dept;
	private int fee;
	private int marks;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public StudentDataEntity(int id, String name, String dept, int fee, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.fee = fee;
		this.marks = marks;
	}
	
}
