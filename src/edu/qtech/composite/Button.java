package edu.qtech.composite;

public class Button extends View {
	
	public Button(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
    public void operation(){
    	System.out.println("我是一个按钮。。。");
    }
}
