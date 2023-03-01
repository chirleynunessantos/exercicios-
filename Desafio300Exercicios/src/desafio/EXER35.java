package desafio;

import java.util.Scanner;

public class EXER35 {

	public static void main(String[] args) {

		double x1 = 0,x2 = 0,y1 = 0,y2 = 0,cx = 0,cy = 0 ,distancia = 0;
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextDouble();
		y1 =sc.nextDouble();
		
		x2 = sc.nextDouble();
		y2 =sc.nextDouble();
		
		cx = Math.pow((x2-x1),2);
		
		cy = Math.pow((y2-y1),2);
		
		distancia = Math.sqrt(cx+cy	);
		
		System.out.printf("%.4f\n",distancia);
	}

}
