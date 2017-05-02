package edu.qtech.composite;

public class Client {
    public static void main(String[] args) {
	    Button button = new Button("���o1");
	    Button button2 = new Button("���o2");
	    Button button3 = new Button("���o3");
	    Button button4 = new Button("���o4");
	    LinearLayout linearLayout = new LinearLayout("���Բ���");
	    linearLayout.addView(button);
	    linearLayout.addView(button2);
	    linearLayout.addView(button3);
	    linearLayout.addView(button4);
	    linearLayout.removeView(button);
	    View view = linearLayout.getChild(2);
	    if(view!=null) view.operation();
	    else {
	    	System.out.println("viewΪ��");
	    }
    }
}
