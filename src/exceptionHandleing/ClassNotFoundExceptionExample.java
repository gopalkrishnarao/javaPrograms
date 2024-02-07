package exceptionHandleing;

public class ClassNotFoundExceptionExample {

	    public static void main(String[] args) {
	        try {
	            // Attempting to load a class that doesn't exist
	            Class.forName("NonExistentClass");
	        } catch (ClassNotFoundException e) {
	            // Handling the ClassNotFoundException
	            System.err.println("Class not found: " + e.getMessage());
	        }
	    }
	}


