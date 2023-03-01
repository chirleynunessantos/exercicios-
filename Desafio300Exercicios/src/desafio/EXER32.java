package desafio;

import java.util.Scanner;

public class EXER32 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		
		
		double media,soma, n1,n2,n3,n4,exame,nova;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		soma = (n1*2)+(n2*3)+(n3*4)+(n4*1);
		
		
		media = soma /(10.0);
	
		
		System.out.printf("Media: %.1f\n",media);
		
		if(media>=7) {
			System.out.println("Aluno aprovado.");
		}else if(media<5) {
			System.out.println("Aluno reprovado.");
		}else if(media>=5 && media <=6.9) {
			System.out.println("Aluno em exame.");
			exame = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f\n",exame);
			nova = (media+exame)/2;
			if(nova>=5) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");

			}
			System.out.printf("Media final: %.1f\n",nova);

		}
		
		
	}
}
