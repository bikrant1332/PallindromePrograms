package bj.practice.demo;

public class PallindromeNo {

	public static void main(String[] args) {
		int inputNo = 121;
		System.out.println(inputNo + " isPallindrome : "+isPallindrome(inputNo));
	}

	private static boolean isPallindrome(int inputNo) {
		return inputNo==reverseDigit(inputNo)?true:false;
	}

	private static int reverseDigit(int inputNo) {
		int reverseNo = 0;
		while(inputNo>0) {
			reverseNo = reverseNo * 10 + inputNo % 10;
			inputNo = inputNo/10;
		}
		
		return reverseNo;
	}

}
