package bj.practice.demo;


public class PallindromeString {

	public static void main(String[] args) {
		String input = "aba";  //can change the input
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
			return false;

		return input.equals(reverseString(input)) ? true : false;
	}

	/**
	 * This method will reverse the string with tradional for loop
	 * @param String input
	 * @return String
	 */
	private static String reverseString(String input) {
		if (input.isEmpty() || input.charAt(0) !=input.charAt(input.length()-1) )
			return null;
		
		
		if(input.length() == 1)
			return input;
		
		
		StringBuilder builder = new StringBuilder();
		for(int i = input.length()-1 ; i>=0; i--) {
			builder.append(input.charAt(i));
		}
		
		
		return  builder.toString();
	}
	
	
	/**This method will reverse the string with StringBuilder reverse method.
	 * @param input
	 * @return
	 */
	private static String reverseStringWithPredefinedMethod(String input) 
	{
		StringBuilder builder = new StringBuilder(input);	
		return builder.reverse().toString();
	}

}
