package desafio;

import java.util.Scanner;

public class EXER69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n=  sc.nextInt();

		for(int i=0;i<n+1;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
