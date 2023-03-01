package desafio;

import java.util.Scanner;

public class EXER48 {

	public static void main(String[] args) {
		
		int valor=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("MUITO OBRIGADO");
		while(valor!=4) {
			
			
			valor=  sc.nextInt();
			
			if(valor==1) {
				System.out.println("Alcool: 1");
			}else if(valor==2) {
				System.out.println("Gasolina: 2");

			}else if(valor==3) {
				System.out.println("Diesel 3");

			}
		}
		
	}
}
