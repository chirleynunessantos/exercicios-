package desafio;

import java.util.Scanner;

public class EXER20 {
	
	public static void main(String[] args) {
		double VALOR,SOMA = 0,MEDIA = 0;
		
		Scanner sc = new Scanner(System.in);
		int CONT=0;
		for(int i=0 ; i<6;i++) {
			
			VALOR = sc.nextDouble();
			if(VALOR>0) {
				CONT= CONT +1;
				SOMA = SOMA+VALOR;
			}
	
	
	}
		System.out.println(CONT+ " valores positivos");
		MEDIA = SOMA / CONT;
		System.out.printf("%.1f\n",MEDIA);
	
		
	}
}
