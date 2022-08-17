package com.StudentInfo;

public class Student {  
	private String name;  
  
	public String getName() {  
		return name;  
	}  
  
	public void setName(String name) {  
		this.name = name;  
	}  
  
	public void displayName(){  
		System.out.println("Student's name : " + name);  
	}  
	public void init(){
		System.out.println("init method");
	}
	public void destroy(){
		System.out.println("destroy method");
	}
} 