package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class Student {
	@Id
	@Column(name="id") 
	private Integer sid;
	public Student()
	{
		
	}

	public Student(Integer sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + "]";
	}
	

}
