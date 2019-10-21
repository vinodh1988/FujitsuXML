package com.demo.system;

import java.util.List;

public class MobileAppProject implements Project {
Outsource outsource;
List<Task>  tasks;


	public MobileAppProject(Outsource outsource,List<Task> tasks) {
	super();
	this.outsource = outsource;
	this.tasks=tasks;
}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Mobile App Project Started");
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("Mobile App Project Details..!!!");
		outsource.to("Testing", "ZEE Testing");
		for(Task x:tasks)
			  x.perform("Mobile Project");
	}

}
