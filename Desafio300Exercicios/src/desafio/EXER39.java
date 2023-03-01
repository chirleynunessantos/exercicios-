package desafio;

import java.util.Scanner;

public class EXER39 {

	public static void main(String[] args) {
		int a,cont=0;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		for(int i=1;i<5;i++) {
			a = sc.nextInt();
			if(a%2==0) {
				cont=cont+1;
			}
		}
		
		System.out.println(cont+" valores pares");
	}

}
