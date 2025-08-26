package Collection;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		
           ArrayList<String> a=new ArrayList<String>();
           a.add("rahul");
           a.add("jadu");
           a.add(0, "prem");
           System.out.println(a);
         //  a.remove(0);
           System.out.println(a);
         
      try {
    	  System.out.println(a.get(2));
      }
      catch(Exception e){
    	  
      }
           
	}

}
