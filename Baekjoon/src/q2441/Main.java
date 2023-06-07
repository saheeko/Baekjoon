package q2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N;
		sc.close();
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j =a ; j >= 1; j--) {
				
				System.out.print("*");
			}
			a--;
			
			System.out.println();
		}

	}

}
