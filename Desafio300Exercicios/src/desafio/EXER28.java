package desafio;

import java.util.Scanner;

public class EXER28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	int idade = 0;
		double media, idade = 0,cont = 0,soma=0;
	//	int cont = 0,soma=0;
		
		while(idade >=0) {
			idade = sc.nextInt();
			if (idade>=0) {
				
			
			cont = cont +1;
			soma = idade+soma;
			
			}
		}
		media = soma/cont;
		System.out.printf("%.2f\n",media);
	}
}
