package files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMatchingInFIle {




	    public static void main(String[] args) {
	        String filePath = "F:/eclipseworklocationdntdelete/DukesDiary1.txt"; // Provide the actual path to your log file

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            int lineNumber =1;
	            while ((line = reader.readLine()) != null) {
	            	lineNumber++;
	                if (containsExceptionKeyword(line)) {
	                    // Process or print the line number and the line that contains the keyword "exception"
	                   // System.out.println("Line " + lineNumber + ": Exception found in log: " + line);
	                	 System.out.println("\033[1mLine " + lineNumber + ": Exception found in log: " + line + "\033[0m");
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading the log file: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    private static boolean containsExceptionKeyword(String logLine) {
	        // Check if the log line contains the keyword "exception" (case insensitive)
	        return logLine.toLowerCase().contains("exception");
	    }
	}


