package exceptionHandleing;

public class NumberFormatExoception {
	
	    public static void main(String[] args) {
	       
	    	
	    	//CASE 1 valid
	    	String validNumber = "10";
	        
	        try {
	            int parsedNumber = Integer.parseInt(validNumber);
	            System.out.println("Parsed number: " + parsedNumber);
	        } catch (NumberFormatException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	        
	        
	    	//CASE 2  INvalid
        String invalidNumber = "abc";
	        
	        try {
	            int parsedNumber = Integer.parseInt(invalidNumber);
	            System.out.println("Parsed number: " + parsedNumber);
	        } catch (NumberFormatException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	        
	        
	    }
	}


