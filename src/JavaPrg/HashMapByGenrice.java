package JavaPrg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapByGenrice {

	public static void main(String[] args) {
		HashMap<String,Integer> h1= new HashMap();
		HashMap<String,Integer> h2= new HashMap();
		h1.put("Adi",01);
		h1.put("AAA",02);
		h2.putAll(h1);
		h2.isEmpty();
		//System.out.println(h2);
		Set<String> s1 = h2.keySet();
		for(Object a:s1)
			System.out.println(a);
//System.out.println(h2);
		Collection<Integer> s2 = h2.values();
		for(Object b:s2) {
			System.out.println(b);
		Set<Entry<String, Integer>> h3 = h2.entrySet();
		for(Entry<String, Integer> h4:h3) {
			System.out.println(h4);
			
		}
					
			
		}
	}

}
