package desafio;

import java.util.Scanner;

public class EXER38 {

	public static void main(String[] args) {

		String a,b,c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.next();
		b = sc.next();
		c = sc.next();
	
		if(a.equals("vertebrado")) {
			
			if(b.equals("ave")) {
				if(c.equals("carnivoro")) {
					System.out.println("aguia");
				}else {
					System.out.println("pomba");
				}
			}else {
				if(c.equals("onivoro")) {
					System.out.println("homem");
				}else {
					System.out.println("vaca");
				}
			}
			
		}else {
			if(b.equals("inseto")) {
				if(c.equals("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			}else {
				if(c.equals("hematofago")) {
					System.out.println("sanguessuga");
				}else {
					System.out.println("minhoca");
				}
			}
		}
	}

}
