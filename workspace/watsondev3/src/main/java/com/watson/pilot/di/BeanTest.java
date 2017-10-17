package com.watson.pilot.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/watson/pilot/beaninit.xml");
		MessageBean mbean = (MessageBean) context.getBean("mbean");
		System.out.println(mbean.sayHello());
	}

}
