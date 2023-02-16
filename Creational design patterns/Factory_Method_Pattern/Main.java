package com.creationalPattern.Factory_Method_Pattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("square");
		shape.draw();
	}
	
}
