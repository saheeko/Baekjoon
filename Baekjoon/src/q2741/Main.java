package q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		//2.while
			int j = 1;
			while(j<=N) {
				System.out.println(j);
				j++;
			}
		}
		////////
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}while(k<=N);
	}

}
