package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student=(Student)context.getBean("student");
		/*
		 * System.out.println(student);
		 * System.out.println(student.getPhones().getClass().getName());
		 */
		System.out.println(student.hashCode());
		Student student1=(Student)context.getBean("student");
		System.out.println(student1.hashCode());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		Teacher t1=(Teacher)context.getBean("teacher");
		System.out.println(t1.hashCode());
		Teacher t2=(Teacher)context.getBean("teacher");
		System.out.println(t2.hashCode());
	}

}
