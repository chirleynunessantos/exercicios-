package desafio;

import java.util.Scanner;

public class EXER49 {

	public static void main(String[] args) {

		int valor=0;
		Scanner sc = new Scanner(System.in);
		valor = sc.nextInt();
		int cont=0;
		
		while (cont<valor) {
			
			String perg = sc.next();
			if(!perg.equals(""))
			System.out.println("I am Toorg!");
			cont =cont+1;
		}
	}

}
