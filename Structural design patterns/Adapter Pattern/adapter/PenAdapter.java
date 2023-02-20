package com.adapter;

import com.externalClass.BlackPen;

public class PenAdapter implements Pen{

	BlackPen blackPen = new  BlackPen();
	
	@Override
	public void writeAssignements(String work) {
		blackPen.mark(work);
	}

	
}
