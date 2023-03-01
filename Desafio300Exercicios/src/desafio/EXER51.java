package desafio;

import java.util.Scanner;

public class EXER51 {

	public static void main(String[] args) {
		double y;
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y=sc.nextDouble();
		double comb = x/y;
		System.out.printf("%.3f%s\n",comb ," km/l");
	}

}
