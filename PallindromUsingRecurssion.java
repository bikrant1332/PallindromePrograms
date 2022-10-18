package bj.practice.demo;

public class PallindromUsingRecurssion {
	public static void main(String[] args) {
		String str = "radar";
		boolean result = pallindromUsingRecurssionMethod(str);
		System.out.println("result is..." + result);
	}

	static boolean pallindromUsingRecurssionMethod(String str) {
		if (str.length() == 0 || str.length() == 1)
			return true;
		System.out.println(str.charAt(0) + " -- " + str.charAt(str.length() - 1) + " -- " + str.substring(1, str.length() - 1));
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return pallindromUsingRecurssionMethod(str.substring(1, str.length() - 1));
		return false;
	}
}