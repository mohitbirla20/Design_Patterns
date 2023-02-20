package com.adapter;

import com.externalClass.BlackPen;

public class School {

	public static void main(String[] args) {
		
		//BlackPen blackPen = new BlackPen(); 
		Pen blackPen = new PenAdapter();
		Assignements assignements = new Assignements();
		assignements.setPen(blackPen);
		assignements.writeAssignements("I Have completed my work...");
	}
	
}
