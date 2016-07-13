package Loop;

import java.util.Scanner;
//calculate a+2^0b,a+2^0b+2^1b,a+2^n-1b
public class Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t != 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			

			int sum = 0;
			sum = sum + a;
			for (int i = 0; i < n; i++) {
				sum = sum + (((int) Math.pow(2, i)) * b);

				System.out.print(sum + " ");

			}
			System.out.println();
			t--;
		}
		scan.close();
	}


}
