package desafio;

public class EXER62 {

	public static void main(String[] args) {
		  
		  for (int i = 1; i <= 9;) {
			  int cont =0;
			  int k=7;
	        	 
	           while(cont<3) {
	        	   cont=cont+1;
	        	   System.out.println("I=" + i + " J=" +k);
	           k = k-1;
	           }
	           if(i==1) {
	        	   i=0;
	           }
	           i = i + 3;
	         
	        }
	}

}
