package desafio;

import java.util.Scanner;

public class EXER31 {

	public static void main(String[] args) {
		
		int cod,quant;
		double valor;
		Scanner sc = new Scanner(System.in);
		
		cod = sc.nextInt();
		quant = sc.nextInt();
		
		if(cod==1) {
			valor = quant*4;
			System.out.printf("Total: R$ %.2f\n",valor);
		}else if (cod==2) {
			valor = quant*4.50;
			System.out.printf("Total: R$ %.2f\n",valor);
		}else if (cod==3) {
			valor = quant*5.00;
			System.out.printf("Total: R$ %.2f\n",valor);
		}else if (cod==4) {
			valor = quant*2.00;
			System.out.printf("Total: R$ %.2f\n",valor);
		}else if (cod==5) {
			valor = quant*1.50;
			System.out.printf("Total: R$ %.2f\n",valor);
		}
		
	}
}
