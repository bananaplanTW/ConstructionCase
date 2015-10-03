package com.bananaplan.constructioncase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructionCaseMain {
	public static void main(String[] args) {
		/**
		 * First step is to create application context where we used framework
		 * API ClassPathXmlApplicationContext(). This API loads beans
		 * configuration file and eventually based on the provided API, it takes
		 * care of creating and initializing all the objects ie. beans mentioned
		 * in the configuration file.
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		/**
		 * Second step is used to get required bean using getBean() method of
		 * the created context. This method uses bean ID to return a generic
		 * object which finally can be casted to actual object. Once you have
		 * object, you can use this object to call any class method.
		 */
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.getMessage();
	}
}
