package view;
 
import controller.MDCRecController;
 
	public class Principal {
 
		public static void main(String[] args) {
			
		    	MDCRecController mdcr = new MDCRecController();
		    	
		    	int x = 20;
		        int y = 24;
		        int mdc = mdcr.calcularMDCRec(x,y);
		        
		        System.out.println("MDC de " + x + " e " + y + " é: " + mdc);
		        
	}
 
}	