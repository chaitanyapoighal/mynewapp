package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaspringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(JpaspringApplication.class, args);
		AdmissionRepo adm=context.getBean(AdmissionRepo.class);
		Student s1=new Student(100);
	   adm.save(s1);
	   Student s2=new Student(102);
	   Student s3=new Student(103);
	   Student s4=new Student(104);
	   adm.saveAll(Arrays.asList(s2,s3,s4));
	   System.out.println(s1);
		
	
	}

}
