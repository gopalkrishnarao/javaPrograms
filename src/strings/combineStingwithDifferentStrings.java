package strings;

public class combineStingwithDifferentStrings {

	    public static void main(String[] args) {
	        String string1 = "HER";
	        String string2 = "URrr";
	        String string3 = "BTrrr";

	        StringBuilder combinedString = new StringBuilder();
	        int minLength = Math.max(Math.max(string1.length(), string2.length()), string3.length());
	        System.out.println(minLength);
	        
	        for (int i = 0; i < 5; i++) {
	            combinedString.append(string1.charAt(i)).append(string2.charAt(i)).append(string3.charAt(i));
	        }

	        System.out.println(combinedString.toString());
	    }
	}


