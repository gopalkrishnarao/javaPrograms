package Streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	 public static void main(String[] args) {
	

		// Create a list of strings
	        String[] words = {"Gopal", "Siri", "kk"};

	

	        // Parallel stream example: Append "1", "2", and "3" to each string
	        Arrays.stream(words)
	                .parallel()  // Convert the stream to a parallel stream
	                .flatMap(word -> Arrays.stream(new String[]{word + "pink", word + "", word + "3"}))
	                .forEach(result -> System.out.println("Result: " + result ));
	   
	   //     to print in order
	        
//	        // Parallel stream example: Append "1", "2", and "3" to each string
//	        List<String> results= Arrays.stream(words)
//	                .parallel()  // Convert the stream to a parallel stream
//	                .flatMap(word -> Arrays.stream(new String[]{word + "pink", word + "red", word + "yellow"}))
//	                .collect(Collectors.toList());
//	   
//	        results.forEach(result -> System.out.println("Result: " + result));
	}

}
