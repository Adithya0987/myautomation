package JavaPrg;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapPrgm {

	public static void main(String[] args) {
	TreeMap a1=new TreeMap();
	a1.put(01,"Adi");
	a1.put(02,"AAA");
	a1.put(03,"BBB");
	a1.put(04, "CCC");
	a1.put(04,"CuC");
	Set<Entry<String, Integer>> s1 = a1.entrySet();
	for(Entry<String, Integer> s2:s1) {
		System.out.println(s2);
	}

	}

}
