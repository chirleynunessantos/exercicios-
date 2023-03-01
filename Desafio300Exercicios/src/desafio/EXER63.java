package desafio;

public class EXER63 {

	public static void main(String[] args) {
		  int k=8;

		  for (int i = 1; i <= 9;) {
			  int cont =0,aux=0;
	        	 
	           while(cont<3) {
	        	   cont=cont+1;
	        	   
	        	   k = k-1;
	        	   aux = k+1;
	        	   System.out.println("I=" + i + " J=" +k);
	        	   
	           }
	           if(k==5) {
	        	   k=aux+4;
	           }else {
	        	   k=aux+5;
	           }
	           
	           if(i==1) {
	        	   i=0;
	           }
	           i = i + 3;
	         
	        }
	}

}