package desafio;

import java.util.Scanner;

public class EXER34 {



		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int valor = sc.nextInt();
			
			for(int i=1; i<valor+1;i++) {
				if(i%2!=0) {
					System.out.println(i);
				}
			}
		}

	

	}
