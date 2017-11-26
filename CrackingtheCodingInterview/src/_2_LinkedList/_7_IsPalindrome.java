package _2_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class _7_IsPalindrome {
	public static boolean isPalindrome (LinkedList<String> n){
		LinkedList<String> reverse = reverseList(n);
		return n.equals(reverse);
	}
	public static LinkedList<String> reverseList (LinkedList<String> n){
		LinkedList<String> reverseList = new LinkedList();
		for(int i=n.size()-1; i>-1; i--){
			String tmp = n.get(i);
			reverseList.add(tmp);
		}
		return reverseList;
	}

	public static void main(String[] args) {
		String test;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string to test : ");
		test = scanner.nextLine();
		
		LinkedList<String> testList = new LinkedList();
		
		for(int i = 0; i<test.length(); i++){
			char tmpChar = test.charAt(i);
			String tmp = Character.toString(tmpChar);
			testList.add(tmp);
		}
		
		System.out.println("Test String : ");
		for(int i =0; i<testList.size(); i++)
			System.out.print(testList.get(i));
		System.out.println("");
		
		boolean result = isPalindrome(testList);
		System.out.println("Result : " + result);
		

	}

}
