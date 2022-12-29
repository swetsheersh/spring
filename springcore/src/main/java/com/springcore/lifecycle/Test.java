package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		Samosa s1=(Samosa)context.getBean("samosa");
		System.out.println(s1);
		//registering shut down hook is used for call destroy method,it is under AbstructApplicationContext.
		context.registerShutdownHook();
		System.out.println("++++++-------------------------------------------------++++++");
		Pepsi p1=(Pepsi)context.getBean("pepsi");
		System.out.println(p1);
		Example example=(Example)context.getBean("example");
		System.out.println(example);
	}

}
