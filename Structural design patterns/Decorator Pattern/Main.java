package com.decorator;

import com.decorator.extra.ExtraSalad;
import com.decorator.extra.Extracheese;

public class Main {

	public static void main(String[] args) {
		BasePizza farmHousePizzaWithExtraCheese = new Extracheese(new FarmhousePizaa());
		System.out.println(farmHousePizzaWithExtraCheese.cost());
		
		BasePizza farmHousePizzaWithExtraCheesAndExtraSalad = new ExtraSalad(new Extracheese(new FarmhousePizaa()));
		System.out.println(farmHousePizzaWithExtraCheesAndExtraSalad.cost());
	}
	
}
