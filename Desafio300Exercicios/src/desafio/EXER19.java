package desafio;

import java.util.Scanner;

public class EXER19 {

	public static void main(String[] args) {

		double valor;
		Scanner sc = new Scanner(System.in);
		int cont=0;
		for(int i=0 ; i<6;i++) {
			
			valor = sc.nextDouble();
			if(valor>0) {
				cont= cont +1;
			}


}
		System.out.println(cont+ " valores positivos");
	}

}
