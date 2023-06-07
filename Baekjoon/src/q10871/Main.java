package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int [] a = new int[b];
		int b1 = sc.nextInt();
		
		for(int i = 0; i < a.length; i ++) {
			a[i] = sc.nextInt();
		}for(int i = 0; i < a.length; i ++) {
			if(a[i] < b1) {
				System.out.print(a[i] + " ");
			}
		}sc.close();
	}

}
