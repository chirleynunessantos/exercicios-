package desafio;

import java.util.Scanner;

public class EXER55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       	double a = sc.nextDouble();	
       	double rea,ganho;
       	
       	if( a>=0 &&a <=400) {
       		rea = a+(a *15/100);
       		ganho = rea-a;
       		System.out.printf("Novo salario: %.2f\n",rea);
       		System.out.printf("Reajuste ganho: %.2f\n",ganho);
       		System.out.println("Em percentual: 15 %");
       		
       	}else if( a>400 &&a <=800) {
       		
       		rea = a+(a *12/100);
       		ganho = rea-a;

       		System.out.printf("Novo salario: %.2f\n",rea);
       		System.out.printf("Reajuste ganho: %.2f\n",ganho);
       		System.out.println("Em percentual: 12 %");
       		
       	}	else if( a>800 &&a <=1200) {
       		
       		rea = a+(a *10/100);
       		ganho = rea-a;
       		System.out.printf("Novo salario: %.2f\n",rea);
       		
       		System.out.printf("Reajuste ganho: %.2f\n",ganho);
       		System.out.println("Em percentual: 10 %");
       		
       	} 	else if( a>1200 &&a <=2000) {

       		rea = a+(a *7/100);
       		ganho = rea-a;
       		System.out.printf("Novo salario: %.2f\n",rea);
       		
       		System.out.printf("Reajuste ganho: %.2f\n",ganho);
       		System.out.println("Em percentual: 7 %");
       		
       	} 	else if( a>2000) {
       

       		rea = a+(a *4/100);
    		ganho = rea-a;
       		System.out.printf("Novo salario: %.2f\n",rea);
       		
       		System.out.printf("Reajuste ganho: %.2f\n",ganho);
       		System.out.println("Em percentual: 4 %");
       	} 
	
	}

}
