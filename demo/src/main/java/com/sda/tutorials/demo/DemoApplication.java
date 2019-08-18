package com.sda.tutorials.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);//refers to @Component("thatSillyCoach") on TennisCoach
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();

	}

}
