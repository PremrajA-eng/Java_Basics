package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "hello");
		hm.put(1, "chalo");
		hm.put(42, "kelo");
		hm.put(5, "dolo");
		hm.put(6, "khelo");
		System.out.println(hm.get(42));
		Set sn= hm.entrySet();
		Iterator it =sn.iterator();
		while(it.hasNext()) {
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
