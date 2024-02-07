package exceptionHandleing;
import java.util.ArrayList;
import java.util.List;

public class outOfMemoryError {



	public static void main(String[] args) {
		List<byte[]> list = new ArrayList<>();


		try {
			recursiveMethod();
		}
		catch (StackOverflowError e) {
			e.printStackTrace();
			//System.out.println("Gopal StackOverflowError  error");
			System.err.println("Caught StackOverflowError: " + e.getMessage());
		}
		finally {
			try {
				while (true) {
					list.add(new byte[1048576]); // Allocate 1 MB memory in each iteration
				}
			} catch (OutOfMemoryError e) {
				System.out.println("Gopal out of memory error");
				System.err.println("Out of Memory Error: " + e.getMessage());
			}
		}

	}

private static void recursiveMethod() {
	recursiveMethod(); // Recursive call without a base case
}
}



