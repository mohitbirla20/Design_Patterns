package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Commponent{

	String name;
	
	List<Commponent> commponents = new ArrayList<>();
	
	public void addCommoenents(Commponent commponent) {
		commponents.add(commponent);
	}
	
	public Composite(String name) {
		super();
		this.name = name;
	}


	@Override
	public void showPrice() {
		
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Commponent commponent : commponents) {
			commponent.showPrice();
		}
		
	}
	

}
