package JavaPrg;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetForGenric {

	public static void main(String[] args) {
		HashSet<Integer>h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(20);
		h1.add(10);
		ArrayList a2= new ArrayList(h1);
		System.out.println(a2);	
	}

}
