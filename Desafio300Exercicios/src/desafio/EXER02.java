package desafio;

import java.util.Scanner;

public class EXER02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		
		for(int i=0; i<10000;i++) {
			if(i%valor==2) {
				System.out.println(i);
			}
		}
	}

}
