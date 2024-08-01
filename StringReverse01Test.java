package testPackage02;

import java.util.Scanner;

public class StringReverse01 {
	
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		
		System.out.println("Please enter the word: ");
		Scanner s = new Scanner(System.in);
				
		String s1 = s.next();
		
		String s2 = "";
		
		System.out.println("Reversed string is: ");
		for (int i=s1.length()-1; i>=0; i--) {
			
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("The entered word is a Palindrome");
			
		} else {
			System.out.println("Not a palindrome");
		}
		
	
	}

}
