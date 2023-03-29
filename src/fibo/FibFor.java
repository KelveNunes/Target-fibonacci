package fibo;

public class FibFor{
	 static long fibFor(int n) {
	        int atual = 0;     
	        int anterior = 0;   

	        for (int i = 1; i <= n; i++) {
	        	
	            if (i == 1) {
	                atual = 1;
	                anterior = 0;
	                
	            } else {
	            	atual += anterior;
	            	anterior = atual - anterior;
	            
	            
	            }
	            
	        }
	        return atual;
	 }
}
