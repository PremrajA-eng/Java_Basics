package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add(10);
		obj.add(3<2);
		obj.add(23.4);
		obj.add("selenium");
		obj.add('a');
		System.out.println(obj);
		
		for (Object bcd:obj) {
			System.out.println("for each loop" +bcd);
			
		}
		Iterator abc=obj.iterator();
		while (abc.hasNext()) {
			System.out.println("while loop" +abc.next());
		}
		
		
	}

}
