package desafio;

import java.util.Scanner;

public class EXER27 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int entrada = 0;
	int senha=2002;
	
	while(entrada!=senha) {
		 entrada = sc.nextInt();
		if ( entrada!=senha)
		System.out.println("Senha Invalida");
		else {
			System.out.println("Acesso Permitido");
		}
	}

}
}
