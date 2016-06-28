package com.sapient.bean;

public class Comp extends Product {
	
	private String mboard;

	
	public Comp(int pid, String pname, double price, String mboard) {
		super(pid, pname, price);
		this.mboard = mboard;
	}



	@Override
	public String isExpensive() {
		if(getPrice() >= 45000)
			return "costlier";
		else
		return "average";
	}



	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display();
	}

	
	
	
	

}
