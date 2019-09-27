package Lincalc;
import java.util.*;

public class LinCalcDavid {

	public static void main(String[] args) {
      	String operatorer = "+-/)(/\"";
    	String operander = "0123456789";
    	String[] postfix = new String [9];
    	String expr = "32+4+5*6";
    	String[] splitOperators = new String [9];
    	
    	    	
    	for (int i = 0; i < expr.length(); i++) {
    		char current = expr.charAt(i);
    			if (memberOf(current, operander)) {
    				postfix[i] = String.valueOf(current);
    				  
    			}
    			if (memberOf(current, operatorer)) {
    				splitOperators[i] = String.valueOf(current);
    			}
    				    			
    			}
    	System.out.println(Arrays.toString(postfix));
    	System.out.println(Arrays.toString(splitOperators));
		
	}
	public static boolean memberOf(char x, String z) {
    	
		for(int i=0; i<z.length(); i++) {
			char current = z.charAt(i);
			if(current == x) {
				return true;
			}
		}
		return false;

}
}
