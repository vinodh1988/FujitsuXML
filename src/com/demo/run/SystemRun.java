package com.demo.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.system.Project;

public class SystemRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
       
       Project p=(Project) ac.getBean("erp");
       p.start();
       p.details();
       System.out.println("-------------------------------------");
       p=(Project)ac.getBean("mobile");
       p.start();
       p.details();
       
       
	}

}
