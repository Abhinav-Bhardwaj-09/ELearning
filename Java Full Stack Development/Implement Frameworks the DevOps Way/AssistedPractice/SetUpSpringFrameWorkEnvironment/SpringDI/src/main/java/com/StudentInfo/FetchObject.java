package com.StudentInfo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FetchObject {
	public static void main(String args[]) {
		//API which takes care of bean creation
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Student obj = context.getBean(Student.class);
		obj.displayName();
		context.registerShutdownHook();
		context.close();
	}
}
