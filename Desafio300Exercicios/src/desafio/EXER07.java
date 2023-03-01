package desafio;

import java.util.Scanner;

public class EXER07 {
/*Leia 3 valores, no caso, variáveis A, B e C, 
 * que são as três notas de um aluno. A seguir, calcule a média do aluno, 
 * sabendo que a nota A tem peso 2, a nota B tem peso 3 e 
 * a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.*/
	public static void main(String[] args) {
		
		
		
	double A,B,C,MEDIA,PESO;
	Scanner sc = new Scanner(System.in);
	
	A = sc.nextDouble();
	B =  sc.nextDouble();
	C = sc.nextDouble();
	PESO = 2 + 3 +5;
	MEDIA = (A  * 2+ B * 3 +C * 5)/ PESO;
	System.out.printf("MEDIA = %.1f\n",MEDIA);
	}

}
