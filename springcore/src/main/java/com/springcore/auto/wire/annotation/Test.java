package com.springcore.auto.wire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/wireconfig.xml");
		Address add1=(Address)context.getBean("address");
		System.out.println(add1);
		Emp emp=(Emp)context.getBean("emp1");
		System.out.println(emp);

	}

}
