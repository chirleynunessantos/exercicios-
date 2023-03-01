package desafio;

import java.util.Scanner;

public class EXER29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double soma=0, media,v;
		int cont = 0;
		
		
			for(int i=0; i<n;i++) {
				media=0;soma=0;
			
				while(cont<3) {
					cont =1+cont;
					v = sc.nextDouble();
					if(cont==1) {
						soma = soma+(v*2);
					}else if(cont==2) {
					soma = soma+(v*3);}else {
					soma = soma+(v*5);}
			}
				 cont = 0;
			
				media = soma/(2+3+5);
				System.out.printf("%.1f\n",media);
			}
		
	
	}
	

}
