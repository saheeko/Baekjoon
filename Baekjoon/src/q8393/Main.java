package q8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		for( n = 1; n <= 3; n++) {
			sum += n;
		}
		System.out.println(sum);
		
	}

}
