package desafio;

import java.util.Scanner;

public class EXER67 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x=  sc.nextDouble();
		double y=  sc.nextDouble();
		double media=0;
		boolean valida = false;
		double xint =0,yint=0;
		while(valida!=true) {
			
			
			
			if(x>=0 && x <=10) {
				 xint= x;
				
			
			}
			if (y>=0 && y<=10) {
				 yint= y;

			}
			
			if(xint!=0 && yint!=0 ) {
				media = (xint+yint)/2;
				System.out.printf("media = %.2f\n",media);
				valida = true;
			}else {
				System.out.println("nota invalida");
				
			
			}
			
			if(xint==0) {
				x=  sc.nextDouble();

			}
			if(yint==0) {
				 y=  sc.nextDouble();

			}
		}
	}

}
