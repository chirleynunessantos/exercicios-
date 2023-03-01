package desafio;

import java.util.Scanner;

public class EXER64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=  sc.nextInt();

		for(int i=0;i<n;i++) {
			
			int x=  sc.nextInt();
			int y=  sc.nextInt();
			
			int soma =0;
			
			if(x<y) {
				for(int t1=x+1;t1<y;t1++) {
					if(t1%2!=0) {
						soma = t1+soma;
					}

				}
				System.out.println(soma);

			}else {
					for(int t2=y+1;t2<x;t2++) {
						if(t2%2!=0) {
							soma = t2+soma;
						}

				}
					System.out.println(soma);
			}
		}
		
		
			
		
			
	}

}
