package JavaPrg;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		ArrayList t1 =new ArrayList();
	t1.add(40);
	t1.add(20);
	t1.add(20);
	t1.add(30);
	t1.add(10);
	t1.add(40);
	t1.add(60);
	//System.out.println(t1);
	TreeSet t2=new TreeSet(t1);
	t2.add(20);
	t2.add(30);
	t2.add(50);
	t2.add(60);
	System.out.println(t2);

	}

}
