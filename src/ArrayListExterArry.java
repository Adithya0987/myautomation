import java.util.ArrayList;

public class ArrayListExterArry {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(5);
		a1.add(10);
		a1.add("Hello");
		a1.add(15);
		a1.add(20);
		a1.add(true);
		int sum =0;
		for(int i=0;i<=a1.size();i++) {
		try {
					Integer i1=(Integer)a1.get(i);
				sum+=i1;
			}catch (Exception e) {
				
			}
		}

		System.out.println(sum);
	}

}
