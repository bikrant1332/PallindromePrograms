package bj.practice.demo;

public class PallindromeStringRecursion {

	public static void main(String[] args) {
		String input = "abcba"; 
		System.out.println(input + " isPallindrome : "+isPallindrome(input));
	}

	
	
	private static boolean isPallindrome(String input) {
		/*
		 * The below condition will check the string is empty or not
		 * if input string is empty, it will return false
		 * and  also it will check for the first character and the last character is same or different
		 * if characters are different then it will return false
		 */
		if (input.isEmpty() || input.charAt(0) !=input.charAt(input.length()-1) )
			return false;
			
		//it checks for single character input, because all single characters are Pallindrome
		if(input.length() == 1)
			return true;
		
		return input.equals(checkPallindromeRecursive(input))?true:false;		
	}

	
	/**
	 * This method will reverse the string with recursion
	 * @param String input
	 * @return String
	 */
	private static String checkPallindromeRecursive(String input) {
		if(input==null || input.isEmpty()) 
			return input;
		
		/*
		 * Here we are collection the last character then again calling the same method
		 * and passing the rest of the characters
		 */
		return input.charAt(input.length()- 1) + checkPallindromeRecursive(input.substring(0, input.length() - 1));

	}

}
