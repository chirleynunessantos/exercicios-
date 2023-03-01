package desafio;

import java.util.Scanner;

public class EXER26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		int cont = 0,pum=0,num = 1;
		
		for(int i =1;i<valor+1;i++) {
			
			while(pum<valor) {
			 cont = cont + 1;
			 
			System.out.print(num+" ");
			num=num+1;
			if (cont>=3) {
				System.out.println("PUM");
				pum=pum+1;
				cont = 0;
				num=num+1;
		
			}}}
		
	}

}
