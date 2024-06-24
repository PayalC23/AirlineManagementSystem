package AirlineSystem;

public class StringUtility {
	 public static int countOccurrences(String str, char ch) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (c == ch) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	    }

	    public static boolean isPalindrome(String str) {
	        String reversed = reverseString(str);
	        return str.equals(reversed);
	    }

	    public static String capitalizeWords(String str) {
	        StringBuilder capitalized = new StringBuilder();
	        boolean capitalizeNext = true;
	        for (char c : str.toCharArray()) {
	            if (capitalizeNext) {
	                capitalized.append(Character.toUpperCase(c));
	                capitalizeNext = false;
	            } else {
	                capitalized.append(c);
	            }
	            if (c == ' ') {
	                capitalizeNext = true;
	            }
	        }
	        return capitalized.toString();
	    }
}
