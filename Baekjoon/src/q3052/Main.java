package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	      int[] n = new int[10];
	      int[] a = new int[10];
	      int check = 0;

	      for (int i = 0; i < n.length; i++) {
	         n[i] = sc.nextInt() % 42;
//	         a[i] = n[i] % 42;
	      }
	      
	      for(int i = 0; i < a.length; i++) {
	    	 if(a[i]>=0) {
	    		 check++; //true 일 때 변수값이 저장이됨.
	    		 if(a[i]<0);
	    		
	    	 }
	      }
	      sc.close();
	      System.out.println(check);
	}

}
