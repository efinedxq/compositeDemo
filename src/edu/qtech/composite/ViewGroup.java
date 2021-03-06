package edu.qtech.composite;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends View {
	 
     private List<View> viewList = new ArrayList<View>();
     
     public ViewGroup(String name) {
		// TODO Auto-generated constructor stub
    	 this.name = name;
	}
     
     public void addView(View view){
    	 viewList.add(view);
    	 System.out.println("我是"+this.name+"，我添加了一个组件:"+view.getName());
     }
     
     public void removeView(View view){
    	 viewList.remove(view);
    	 System.out.println("我是"+this.name+"，我删除了一个组件:"+view.getName());
     }
     
     public List<View> getChildren(){
    	 System.out.println("我是"+this.name+"，我返回了所有的构件...");
    	 return this.viewList;
     }
     
     public View getChild(int i){
    	
    	 if(viewList==null) {
    		 System.out.println("我是"+this.name+"，我为空");
    		 return null;
    	 }
    	 if(i>=viewList.size()){
    		 System.out.println("我是"+this.name+"，我不包含:"+i);
    		 return null;
    	 }
    	 System.out.println("我是"+this.name+"，我返回了一个子构件:"+i);
         return viewList.get(i);
     }
} 
