package com.demo.system;

public class OutsourceModel2 implements Outsource {

	@Override
	public void to(String activity, String company) {
		// TODO Auto-generated method stub
		   System.out.println("Outsourced following process model2");
	       System.out.println("Activity outsourced::"+activity);
	       System.out.println("Company ::"+company);
	}

}
