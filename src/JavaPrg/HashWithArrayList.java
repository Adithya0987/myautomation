package JavaPrg;

import java.util.ArrayList;
import java.util.HashSet;

public class HashWithArrayList {

	public static void main(String[] args) {
		ArrayList h2= new ArrayList();
		h2.add(10);
		h2.add(20);
		h2.add(20);
		h2.add(10);
		h2.add(30);
		h2.add(40);
		h2.add("Helllo");
		h2.add("Bye");
		HashSet a2=new HashSet(h2);
		System.out.println(a2);
		
	}

}
