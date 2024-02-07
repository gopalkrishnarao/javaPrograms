package exceptionHandleing;

public class finallyBlcokExecutionExample {
	
	    public static void main(String[] args) {
	       
	    	
	    	//CASE 1 valid
	    	String validNumber = "10";
	        

	        
	    	//CASE 2  INvalid
        String invalidNumber = "abc";
	        
	        try {
	            int parsedNumber = Integer.parseInt(invalidNumber);
	            System.out.println("Parsed number: " + parsedNumber);
	        } catch (NumberFormatException e) {
	            System.err.println("Error: " + e.getMessage());
	            e.printStackTrace();
	        }
	        finally {
	        	System.out.println("always it is exected");
	        }
	        
	        
	        try {
            int parsedNumber = Integer.parseInt(validNumber);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
	        finally {
	        	System.out.println("always it is exected");
	        }
        
	        
	    }
	}


