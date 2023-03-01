package desafio;
import static java.lang.Math.*;
import java.util.Scanner;

public class EXER42 {

	public static void main(String[] args) {

		
		int x,y,ini,fim,soma = 0;
		Scanner sc = new Scanner(System.in);
		
		x = Math.abs(sc.nextInt());
		y = (Math.abs(sc.nextInt()));

		if(x<y) {
			ini=x;
			fim=y;
		}else {
			ini=y;
			fim=x;
	}
		
	for(int i =ini; i<fim;i++) {
		
		if(i%2!=0) {
			soma = soma+i;
		}
		
	}
	System.out.println(soma);
}

}
