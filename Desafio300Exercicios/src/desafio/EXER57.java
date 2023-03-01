package desafio;

import java.util.Scanner;

public class EXER57 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hi=0, mi=0;
		
		hi = sc.nextInt();
	
		for (int i=1; i<hi+1;i++) {
			if(i%2==0) {
				mi = (int) Math.pow(i, 2);
				System.out.println(i+"^2 = "+mi);
			}
		}

	
	}

}
