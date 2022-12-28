import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of row");
		int n = sc.nextInt();
		int alpha =65;
		for(int i=0;i<=n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print((char)(alpha+i));
			}
			System.out.println();
		}
		
	}

		

}
