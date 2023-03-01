package desafio;

import java.util.Scanner;

public class EXER10 {

	public static void main(String[] args) {

		String nome ;
		double salario,receber,totalVendas ;
		
		
		Scanner sc = new Scanner(System.in);
		
		nome = sc.nextLine();
		salario =   sc.nextDouble();
		
		
		totalVendas =sc.nextDouble();
		
		receber = ((totalVendas *15)/100)+salario;
		
		System.out.printf("TOTAL = R$ %.2f\n",receber);
	
		
		

	}

}
