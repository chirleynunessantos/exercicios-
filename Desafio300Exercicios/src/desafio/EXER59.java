package desafio;

import java.util.Scanner;

public class EXER59 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int n=  sc.nextInt();
		 int  m=  sc.nextInt();
	     
		while(n>0 && m>0) {
			int cont=0;

		     if(m>n) {
			     for (int i = n; i <m+1; i++) {
			    		cont =cont +i;
					System.out.print(i+" ");
			     }
                System.out.print("Sum="+cont+"\n");

		     }else {
				for (int i = m; i <n+1; i++) {
					cont =cont +i;
					System.out.print(i+" ");

			     }
                System.out.print("Sum="+cont+"\n");

			}
		
		 n=  sc.nextInt();
	     m=  sc.nextInt();
			
		}
					
		}
	

}
