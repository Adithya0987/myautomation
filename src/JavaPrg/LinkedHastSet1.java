package JavaPrg;


import java.util.LinkedHashSet;

public class LinkedHastSet1 {

	public static void main(String[] args) {
		LinkedHashSet t1 = new LinkedHashSet();
					t1.add(10);
					t1.add(20);
					t1.add(30);
					t1.add("Add");
					t1.add("Sub");
					//System.out.println(t1);
					LinkedHashSet t2 = new LinkedHashSet(t1);
					t2.add(10);
					t2.add(30);
					t2.add(80);
					t2.add("The");
					System.out.println(t2);
	}

}
