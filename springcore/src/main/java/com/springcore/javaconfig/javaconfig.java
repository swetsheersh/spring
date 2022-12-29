package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaconfig {

	 @Bean 
	 public Samosa getSamosa() { 
		Samosa samosa = new Samosa(); 
		return samosa; 
	 }
	
	 @Bean(name= {"student","temp","con"}) 
	 
	 /*To change the bean name,we can set 
	 any number of name to bean and get it from these name.
	 so,we provided list*/
	 
	 public Student getStudent() { 
		 //creating an object of Student type
		 Student student =new Student(getSamosa()); 
		 return student;
	 }
	 
}
