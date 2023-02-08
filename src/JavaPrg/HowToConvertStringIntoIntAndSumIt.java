package JavaPrg;

public class HowToConvertStringIntoIntAndSumIt {

	public static void main(String[] args) {
		String a="[1,2,3,71,89,4]";
		a=a.replace("[","").replace("]","").replace(","," ");
		String s1[]=a.split(" ");
		int b=0;
		for(int i=0;i<s1.length;i++) {
			b=b+Integer.parseInt(s1[i]);
		}
		System.out.println(b);
		

	}

}
