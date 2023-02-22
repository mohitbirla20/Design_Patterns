package com.command;

public class MenuOptions {

	Command opneCommand;
	Command saveCommand;
	
	public MenuOptions(Command opneCommand, Command saveCommand) {
		super();
		this.opneCommand = opneCommand;
		this.saveCommand = saveCommand;
	}
	
	public void clickOpen() {
		System.out.println("document oppened...!");
	}
	
	public void clickSave() {
		System.out.println("document saved...!");
	}
	
	
	
}
