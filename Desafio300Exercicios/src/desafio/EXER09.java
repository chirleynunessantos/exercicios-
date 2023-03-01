package desafio;

import java.util.Scanner;

public class EXER09 {

	public static void main(String[] args) {
		
		int numFun,numHoras;
		double vlrHora,salario;
		Scanner sc = new Scanner(System.in);
		
		numFun = sc.nextInt();
		numHoras= sc.nextInt();
		
		vlrHora =sc.nextDouble();
		
		salario = vlrHora * numHoras;
		
		System.out.println("NUMBER = "+numFun);
		System.out.printf("SALARY = U$ %.2f\n",salario);
		//System.out.printf("MEDIA = %.1f\n",MEDIA);
		//%.1f\n
	}
}
