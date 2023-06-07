package q9498;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();

		int s = score / 10;
		switch (s){
		case 10:
		case 9:
			System.out.printf("A");
			break;
		case 8:
			System.out.printf("B");
			break;
		case 7:
			System.out.printf("C");
			break;
		case 6:
			System.out.printf("D");
			break;
		default:
			System.out.printf("F");
			break;
		}
	}
}
