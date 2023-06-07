package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
//		System.out.println(N);
		
		for(int i = 0; i >= N; i++) {
			for(int j = i-1; j > N; j--) {
			System.out.print("?");
		}
			for(int j = 0; j > 1 + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
