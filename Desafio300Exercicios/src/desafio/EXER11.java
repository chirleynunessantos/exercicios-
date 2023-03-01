package desafio;

import java.util.Scanner;

/*12 1 5.30
16 2 5.10*/
public class EXER11 {

	public static void main(String[] args) {
		
		int  peca1,num1, peca2, num2;
		double vlrpeca1 ,vlrpeca2,vlrPagar;
		
		Scanner sc = new Scanner(System.in);
		
		peca1 = sc.nextInt();
		num1 = sc.nextInt();
		vlrpeca1 = sc.nextDouble();
		peca2 = sc.nextInt();
		num2 = sc.nextInt();
		vlrpeca2 = sc.nextDouble();
		
		vlrPagar = (num1 * vlrpeca1)+num2 * vlrpeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",vlrPagar);
		
		
	}
}
