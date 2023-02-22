package com.command;

public class ActionSave  implements Command{  
	  
	    private Document doc;  
	   
	    public ActionSave(Document doc) {  
	        this.doc = doc;  
	    }  
	   
	    @Override  
	    public void execute() {  
	        doc.save(); 
	        System.out.println("document saved..!");
	    }  
	
} 
