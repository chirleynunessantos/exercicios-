package desafio;

import java.util.Scanner;
/*Sequências Crescentes

*/
public class EXER68 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x=  1;
		String f=" " ;
		while(x!=0) {
			x=  sc.nextInt();
			for(int i =1;i<x+1;i++) {
				if(i==x+1) {
					f="";
				}
				System.out.print(i+f);
			}
			
		}
	}

}
