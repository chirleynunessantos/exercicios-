package desafio;

import java.util.Scanner;

public class EXER41 {

	public static void main(String[] args) {
	
		int a,v,cont=0;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		v=a;
	while(cont<6) {
			
			if (v%2!=0) {
					System.out.println(v);
					cont=cont+1;
			}
			v=v+1;
		}
	}

}
