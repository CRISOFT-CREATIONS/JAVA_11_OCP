package com.kenzo.javaIO.Ser_DeSer;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 3931080480978783552L;
	
	int id;
	String name;
	int age;
	double salary;
	transient String collegeName;				// transient fields are non-serializable.
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", collegeName=" + collegeName + "]";
	}
	

}
