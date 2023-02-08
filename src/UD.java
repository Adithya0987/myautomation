import java.util.Scanner;

public class UD {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Row Size");
		int rowSize = sc.nextInt();
		//System.out.println("Enter the column size");
		int a[][]= new int[rowSize][];
		System.out.println("Enter the value");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter The Size");
			a[i]= new int[sc.nextInt()];
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
