package qqq;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < a; i++) {
			for(int j = i-1; j <a-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
