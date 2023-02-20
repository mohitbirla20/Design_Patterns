package com.adapter;

public class Assignements {

	private Pen pen;

	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	public void writeAssignements(String work) {
		pen.writeAssignements(work);
	}
	
}
