package strings;


public class palindrome {




	    public static boolean isPalindrome(String str) {
	        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
	        System.out.println("string after modification is "+str);
	        int left = 0;
	        int right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++; 
	            right--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    	 String input = "A man, a plan, a canal, Panama!";
	        System.out.println("string after modification is "+input);
	        boolean palindrome = isPalindrome(input);
        
	        if (palindrome) {
	            System.out.println("The input is a palindrome said by gopal");
	        } else {
	            System.out.println("The input is not a palindrome.");
	        }
	    }
	}

	



