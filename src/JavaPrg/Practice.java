package JavaPrg;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(0,"10");
		a1.add("400");
		a1.add(10);
		//System.out.println(a1);
		a1.add(1, 500);
		System.out.println(a1.lastIndexOf("400"));
		System.out.println(a1);
		a1.set(0, "200");
		System.out.println(a1);
			

	}

	
		
	}


