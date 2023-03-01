package desafio;

import java.util.Scanner;

public class EXER13 {

	public static void main(String[] args) {
		 double A,B,C,TRI,CIR,TRA,QUA,RET;
		    Scanner sc = new Scanner(System.in);

		    
		    A = sc.nextDouble();
		    B = sc.nextDouble();
		    C  = sc.nextDouble();
		    
		    TRI = A * C/2;
		    CIR = 3.14159*Math.pow(C,2);
		    TRA = ((A+B)/2)*C;
		    QUA =B*B;
		    RET = A*B;
		    
		    
		    System.out.printf("TRIANGULO: %.3f\n",TRI);
		    System.out.printf("CIRCULO: %.3f\n",CIR);
		    System.out.printf("TRAPEZIO: %.3f\n",TRA);
		    System.out.printf("QUADRADO: %.3f\n",QUA);
		    System.out.printf("RETANGULO: %.3f\n",RET);
		    }

}
