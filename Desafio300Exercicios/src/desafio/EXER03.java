package desafio;

import java.util.Scanner;

public class EXER03 {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		double raio,area, n= 3.14159;
		raio = sc.nextDouble();
		area = n*Math.pow(raio, 2);
		System.out.printf("A=%.2f\n ",area);
	
	}

}
