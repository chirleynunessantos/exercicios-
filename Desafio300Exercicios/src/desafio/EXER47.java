package desafio;

import java.util.Scanner;

public class EXER47 {

	public static void main(String[] args) {
		// TODO Auto-generated 	int a,b,ini,fim;
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int h, m ,o=0;
		String frase="";
		for(int i=0;i<a;i++) {
			h = sc.nextInt();
			m = sc.nextInt();
			o= sc.nextInt();
			if(o == 1) {
				frase= " - A porta abriu" ;
			}else{
				frase=	" - A porta fechou";
			
			}
			
			System.out.println(h+":"+m+frase);
		}
	}

}
