package edu.qtech.composite;

public abstract class View {
	protected String name;
	
	public void operation(){
    	System.out.println("Œ“ «:"+name);
    }
	
	public String getName() {
			return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
