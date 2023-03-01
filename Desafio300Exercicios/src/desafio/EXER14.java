package desafio;

import java.util.Scanner;

public class EXER14 {

	public static void main(String[] args) {
		 
        int a ,b, c ,maioab;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b) {maioab =a;
        }else {
        	maioab=b;
        }
        
    
 	//   System.out.println(maioab+ "eh o maior");

      
       if (maioab > c) { 
    	   System.out.println(maioab+ " eh o maior");
       }else {
       
        	 System.out.println(c+ " eh o maior");}
        	
	}
}
