package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("india");
		hs.add("india");
		hs.add("nepal");
		hs.add("bhutan");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
        Iterator<String> i=hs.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
	}

}
