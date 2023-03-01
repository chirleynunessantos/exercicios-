package desafio;

import java.util.Scanner;

public class EXER12 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      double valor,raio,pi=3.14159;
	      valor = sc.nextDouble();
	      raio = (4/3.0)*pi* Math.pow(valor,3);
	      
	      System.out.printf("VOLUME = %.3f\n",raio);
	}

}
