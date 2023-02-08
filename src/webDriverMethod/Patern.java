package webDriverMethod;

public class Patern {

	public static void main(String[] args) {
		int ch=1;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				if(j==2&&i==3||j==2&&i==4||j==3&&i==4||j==2&&i==5||j==3&&i==5||j==4&&i==5) {
					System.out.print(ch++);
				}
				else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		

	}

}
