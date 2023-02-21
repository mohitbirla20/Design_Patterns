package com.decorator.extra;

import com.decorator.BasePizza;
import com.decorator.ToppingDecorator;

public class ExtraMasroom extends ToppingDecorator{

	BasePizza basePizza;

	public ExtraMasroom(BasePizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basePizza.cost()+70; //40 is price of extra cheese.
	}

}
