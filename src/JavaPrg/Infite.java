package JavaPrg;

public class Infite {

	public static void main(String[] args) {
		int a=1;
		add(a);
	}
	public static void add(int a) {
		
		if(a<=100) {
			System.out.println(a+" ");
			add(a+1);
		}

	}

}
