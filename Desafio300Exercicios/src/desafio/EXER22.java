package desafio;

import java.util.Scanner;

public class EXER22 {

	public static void main(String[] args) {
	
		int N;
		double valor ;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i =0; i <N; i++) {
			valor = sc.nextDouble();
			
			if (valor%2==0 && valor !=0) {
				System.out.print("EVEN ");
			} 
			if(valor%2!=0) {
				System.out.print("ODD ");
			} 
			if(valor>0) {
				System.out.println("POSITIVE ");
			} 
			if (valor<0) {
				System.out.print("NEGATIVE ");

			} 
			if (valor==0) {
				System.out.print("NULL ");
		}
			System.out.println("");

		}
	
	
	
	}

}
