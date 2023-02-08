package JavaPrg;

import java.util.ArrayList;

public class JAvaPA {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		int sum =0;
		for(Object b:a1) {
			sum+=(int) b;
		}
		System.out.println(sum);
	}

}
