package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person person=(Person)context.getBean("person");
		Addition add=(Addition)context.getBean("addition");
		Addition add1=(Addition)context.getBean("addition1");
		System.out.println(person);
		add.dosum();
		add1.dosum();
		Addition add2=(Addition)context.getBean("addition2");
		add2.dosum();
	}

}
