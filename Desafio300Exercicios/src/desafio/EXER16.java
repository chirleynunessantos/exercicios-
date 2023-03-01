package desafio;

import java.util.Scanner;

public class EXER16 {
	public static void main(String[] args) {
		 double x1 ,y1,x2 ,y2,valor,distancia;
	      
		 Scanner sc = new Scanner(System.in);
	      x1 = sc.nextDouble();
	      y1 = sc.nextDouble();
	      x2 = sc.nextDouble();
	      y2 = sc.nextDouble();
	      
	      valor = Math.pow((x2-x1),2)+Math.pow((y2+y1),2);
	      
	      distancia = Math.sqrt(valor);
	      System.out.printf("%.2f\n",distancia);
	}
	 
}
