package com.creationalPattern.Factory_Method_Pattern;

public class ShapeFactory {

	public Shape getShape(String input) {
		switch(input) {
		   case "circle" :
		     return new Circle();
		   case "square" : 
			   return new Square();
		   case "ractengle" :
			   return new Rectangle();
		   default : return null;
		}
	}

}
