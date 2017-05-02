package edu.qtech.composite;

public class Client {
    public static void main(String[] args) {
	    Button button = new Button("按鈕1");
	    Button button2 = new Button("按鈕2");
	    Button button3 = new Button("按鈕3");
	    Button button4 = new Button("按鈕4");
	    LinearLayout linearLayout = new LinearLayout("线性布局");
	    linearLayout.addView(button);
	    linearLayout.addView(button2);
	    linearLayout.addView(button3);
	    linearLayout.addView(button4);
	    linearLayout.removeView(button);
	    View view = linearLayout.getChild(2);
	    if(view!=null) view.operation();
	    else {
	    	System.out.println("view为空");
	    }
    }
}
