package com.ashish.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashish.spring.bean.HelloWorld;

public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");  
		HelloWorld hw1=(HelloWorld)context.getBean("helloWorld");  
		hw1.setMessage("I am helloWorld");      
		HelloWorld hw2=(HelloWorld)context.getBean("helloWorld");  
		System.out.println("My Message1 :" + hw1.getMessage());   
		System.out.println("My Message2 :" + hw2.getMessage());  

	}

}
