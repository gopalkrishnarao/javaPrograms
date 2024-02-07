package exceptionHandleing;

public class classDefNotFoundError {

	public class NoClassDefFoundErrorExample {
	    public static void main(String[] args) {
	        try {
	            // Attempting to create an instance of a class that doesn't exist
	        	ClassNotFoundExceptionExample2 obj = new ClassNotFoundExceptionExample2();
	        } catch (NoClassDefFoundError e) {
	            System.out.println("NoClassDefFoundError");
	        }
	    }
	}}

	


