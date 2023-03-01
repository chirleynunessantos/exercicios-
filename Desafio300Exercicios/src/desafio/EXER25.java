package desafio;

import java.util.Scanner;

public class EXER25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valor = 0,aux = 0,posi=0;
		
		for(int i =1;i < 101 ; i++) {
			valor = sc.nextInt();
			if(valor > aux) {
				aux = valor;
				posi = i;
			} 
			
		}
		System.out.println(aux);
		System.out.println(posi);
	}

}
