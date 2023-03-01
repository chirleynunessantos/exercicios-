package desafio;

import java.util.Scanner;

public class EXER56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       	int a = sc.nextInt();	
       	double novo = a;
       	int v100 = 0,v50=0, v20 = 0,v10=0,v5 = 0,v2=0, v1 = 0;
       	
       while (novo > 0) {
    	   
    	   if(novo>=100) {
    		   novo = novo-100;
    		   v100 = v100 +1;
    	   }else if  ( novo<100 && novo >=50) {
    		   novo = novo-50;
    		   v50 = v50 +1;
    	   }else if  ( novo<50 && novo >=20) {
    		   novo = novo-20;
    		   v20 = v20 +1;
    	   }else if  ( novo<20 && novo >=10) {
    		   novo = novo-10;
    		   v10 = v10 +1;
    	   }else if  ( novo<10 && novo >=5) {
    		   novo = novo-5;
    		   v5 = v5 +1;
    	   }else if  ( novo<5 && novo >=2) {
    		   novo = novo-2;
    		   v2 = v2 +1;
    	   }else if  ( novo<2 && novo >=1) {
    		   novo = novo-1;
    		   v1 = v1 +1;
    	   }
    	  
    	  
    	  
      
       }
       System.out.println(a);

       System.out.println(v100+" nota(s) de R$ 100,00");
       System.out.println(v50+" nota(s) de R$ 50,00");
       System.out.println(v20+" nota(s) de R$ 20,00");
       System.out.println(v10+" nota(s) de R$ 10,00");
       System.out.println(v5+" nota(s) de R$ 5,00");
       System.out.println(v2+" nota(s) de R$ 2,00");
       System.out.println(v1+" nota(s) de R$ 1,00");

	}
	
}
