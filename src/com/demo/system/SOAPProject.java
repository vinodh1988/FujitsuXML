package com.demo.system;

import java.util.List;

public class SOAPProject implements Project{
Outsource outsource;
List<Task>  tasks;

public List<Task> getTasks() {
	return tasks;
}

public void setTasks(List<Task> tasks) {
	this.tasks = tasks;
}

public Outsource getOutsource() {
	return outsource;
}

public void setOutsource(Outsource outsource) {
	this.outsource = outsource;
}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("SOAP Project Started");
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("SOAP  project Details");
		outsource.to("Translation module", "MX company");
		for(Task x:tasks)
			  x.perform("SOAP Project");
	}

}
