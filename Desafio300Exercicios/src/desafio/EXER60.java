package desafio;

import java.util.Scanner;

public class EXER60 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int x =  sc.nextInt();
		int y =  sc.nextInt();
	     
		while(x!=y) {
		
		     String resultado =	(x > y)? "Decrescente":"Crescente";	     
	            System.out.println(resultado);

			 x=  sc.nextInt();
			 y=  sc.nextInt();
		}
	
	
	}

}
