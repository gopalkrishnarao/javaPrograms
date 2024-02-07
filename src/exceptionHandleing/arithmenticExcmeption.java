package exceptionHandleing;

public class arithmenticExcmeption {


	    public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0;

	        try {
	            int result = numerator / denominator; // Division by zero
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.err.println("exception: " + e.getMessage());
	        }
	    }
	}

