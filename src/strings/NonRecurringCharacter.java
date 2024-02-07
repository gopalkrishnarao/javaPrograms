package strings;

//first nonrecurring
	public class NonRecurringCharacter {
	    public static char findNonRecurringCharacter(String str) {
	        // Create an array to store the count of each character
	        int[] charCount = new int[256]; // Assuming ASCII characters

	        // Count the occurrences of each character in the string
	        for (int i = 0; i < str.length(); i++) {
	        	System.out.println("character getting scanned is "+str.charAt(i));
	        	System.out.println(charCount[str.charAt(i)]);
	            charCount[str.charAt(i)]++;
	        }

	        // Find the first character with a count of 1
	        for (int i = 0; i < str.length(); i++) {
	            if (charCount[str.charAt(i)] == 1) {
	                return str.charAt(i);
	            }
	        }

	        // If no non-recurring character found, return a placeholder value, e.g., '\0'
	        return '\0';
	    }

	    public static void main(String[] args) {
	        String input = "abacabad"; // Example input
	        char nonRecurringChar = findNonRecurringCharacter(input);
	        
	        if (nonRecurringChar != '\0') {
	            System.out.println("The first non-recurring character is: " + nonRecurringChar);
	        } else {
	            System.out.println("No non-recurring character found.");
	        }
	    }
	}


