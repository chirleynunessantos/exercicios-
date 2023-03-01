package desafio;

import java.util.Scanner;

public class EXER40 {

	public static void main(String[] args) {
		int a,par=0,imp=0,pos=0,neg=0;
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0;i<5;i++) {
			
			a = sc.nextInt();
			
			if(a%2==0) {
				par=par+1;
			}else {
				imp=imp+1;
			}
					
			if(a>0) {
				pos=pos+1;
			}else if (a<0) {
				neg=neg+1;
			}
		}
		
		System.out.println(par+" valor(es) par(es)");
		System.out.println(imp+" valor(es) impar(es)");
		System.out.println(pos+" valor(es) positivo(s)");
		System.out.println(neg+" valor(es) negativo(s)");

	}

}
