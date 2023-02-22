package com.command;

public class CommanPatternClient {

	public static void main(String[] args) {
        Document doc = new Document();  
        
        Command clickOpen = new ActionOpen(doc);  
        Command clickSave = new ActionSave(doc);  
          
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
          
        menu.clickOpen();  
        menu.clickSave();  
	}

}
