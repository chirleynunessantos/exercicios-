package desafio;

import java.util.Scanner;

public class EXER58 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int hi=  sc.nextInt();
		
		for (int i=0; i<hi;i++) {
			
			if(i==hi-1) {
				System.out.printf("%s\n","Ho!");
			}else {
			System.out.printf("Ho ");
			}
			
		}
	
	}
	}
