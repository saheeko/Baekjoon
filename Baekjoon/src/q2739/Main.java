package q2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for(int m = 1;m <=9; m++) {
			System.out.println(n + " * " + m + " = " + (n*m));
		}
		
	}

}
