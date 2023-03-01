package desafio;

import java.util.Scanner;

public class EXER70 {

	public static void main(String[] args) {

		int mult1=0,mult3=0,mult4=0,mult5=0;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int l = sc.nextInt();
			if(l%2==0) {
				mult1=mult1+1;
			}
			if(l%3==0) {
				mult3=mult3+1;

			}
			if(l%4==0) {
				mult4=mult4+1;

			} if(l%5==0) {
				mult5=mult5+1;

			}
		}
		
		System.out.println(mult1+" Multiplo(s) de 2");
		System.out.println(mult3+" Multiplo(s) de 3");
		System.out.println(mult4+" Multiplo(s) de 4");
		System.out.println(mult5+" Multiplo(s) de 5");

	}

}
