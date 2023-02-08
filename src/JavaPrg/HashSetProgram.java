package JavaPrg;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet h1= new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(20);
		for(Object a:h1) {
			System.out.println(a);
		}

	}

}
