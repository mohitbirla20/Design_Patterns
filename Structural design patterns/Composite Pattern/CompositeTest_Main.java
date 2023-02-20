package com.composite;

public class CompositeTest_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Commponent hdd = new Leaf(3000,"HDD");
        Commponent mouse = new Leaf(500,"mouse");
        Commponent moniter = new Leaf(2500,"moniter");
        Commponent ram = new Leaf(4000,"ram");
        Commponent cpu = new Leaf(15000,"cpu");

        Composite ph = new Composite("peri");
        Composite mb = new Composite("mother board");
        Composite cabinet = new Composite("cabinet");
        Composite computer = new Composite("computer");
        
        mb.addCommoenents(cpu);
        mb.addCommoenents(ram);

        ph.addCommoenents(mouse);
        ph.addCommoenents(moniter);
        
        cabinet.addCommoenents(hdd);
        cabinet.addCommoenents(mb);
        
        computer.addCommoenents(ph);
        computer.addCommoenents(cabinet);
        
        ram.showPrice();
        moniter.showPrice();
        System.out.println("**********************************");
        mb.showPrice();
        System.out.println("**********************************");
        ph.showPrice();
        System.out.println("**********************************");
        computer.showPrice();
	}

}
