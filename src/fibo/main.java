package fibo;

public class main {
	
	//fibonaci
	public static void main(String[] args) {
		int numeroTeste = 4;
	    for (int i = 0; i < numeroTeste+2; i++) {
	    	System.out.println(FibFor.fibFor(i));
	        if(numeroTeste == FibFor.fibFor(i)) {
	        	System.out.println("Numero teste ->" + numeroTeste+ ":------compativel-------");
	        	break;
	        	
	        }
	        if(FibFor.fibFor(i)>numeroTeste) {
	        	System.out.println("Numero teste ->" + numeroTeste+ ": ------não compativel-------");
	        	break;
	        }
	        
	    }
	  
	    
		
	}

}
