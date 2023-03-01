package desafio;

import java.util.Scanner;

public class EXER15 {

	public static void main(String[] args) {
        int X;
        double Y,gasto;
        
        Scanner sc  = new Scanner(System.in);
        
        X = sc.nextInt();
        Y = sc.nextDouble();
        gasto = Y*X;
        
        System.out.printf("%.3f\n"+gasto);

	}

}
