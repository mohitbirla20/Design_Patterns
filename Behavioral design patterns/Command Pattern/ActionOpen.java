package com.command;

public class ActionOpen implements Command{  
    
	private Document doc;  
    
	public ActionOpen(Document doc) {  
        this.doc = doc;  
    }  
    
	@Override  
    public void execute() {  
        doc.open();  
        System.out.println("document opend..!");
    }
	
}  