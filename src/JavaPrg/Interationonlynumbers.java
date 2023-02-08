package JavaPrg;

import java.util.ArrayList;
import java.util.Iterator;

public class Interationonlynumbers {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(5);
		a1.add(10);
		a1.add("Hello");
		a1.add("Bye");
		a1.add(100);
		Iterator i= a1.iterator();
		int sum1=0;
		while(i.hasNext()) {
		try {
			Integer a2=(Integer)i.next();
			sum1+=a2;
		}
		catch(Exception e){
			
		}
		
	}
		System.out.println(sum1);

}
}
