package desafio;

import java.util.Scanner;

public class EXER17 {


	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
	
		
		int dias = 0, mes= 0, ano= 0,idade= 0;
		idade= 	sc.nextInt();
		
		  ano = idade / 365;
	      mes = ((idade % 365) / 30);
	        dias = ((idade % 365) % 30);
		
		System.out.println(ano+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(dias+" dia(s)");
	}

}
