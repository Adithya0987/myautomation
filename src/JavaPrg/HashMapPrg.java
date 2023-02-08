package JavaPrg;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPrg {

	public static void main(String[] args) {
		HashMap n1=new HashMap();
		n1.put(01,"Adi");
		n1.put(02,"BBB");
		n1.put(03,"AAA");
		n1.put(5,"ccc" );
		n1.put(5,"bbb");
		n1.put(6,"BBB");
		System.out.println(n1);
		n1.put(4,"8" );
		System.out.println(n1);
		System.out.println(n1.size());//to check wethear how much data is present data
		System.out.println(n1.isEmpty());//to check weather how any empty data is present or not
		//n1.clear();//To eariser the everthing;
		//System.out.println();
		//System.out.println(n1.size());//to check wethear how much data is present data
		System.out.println(n1.containsKey(10));
		System.out.println(n1.containsValue("ccc"));
		System.out.println(n1.get(5));
		n1.remove(5);
		System.out.println(n1);
		System.out.println(n1.keySet());
	
	}

}
