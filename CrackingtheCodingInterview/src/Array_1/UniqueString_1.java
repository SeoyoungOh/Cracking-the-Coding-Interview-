package Array_1;

import java.util.Scanner;

/*
 * 1.1. 문자열에 포함된 문자들이 전부 유일한지를 검사하는 알고리즘 구현
 * - 대신 다른 자료구조를 사용할 수 없는 상황
 * */

public class UniqueString_1 {
	/* - 문자열이 ASCII 인지 유니코드인지 먼저 질문 할 것 (ASCII 라는 가정)
	 * 1. 문자열의 길이가 문자 집합 크기보다 클 경우 false 반환
	 * 2. 같은 원소에 두번 접근하면 바로 false 반환
	 * */
	
	public static boolean uniqueTest(String S){
		if(S.length() > 256) 
			return false;
		boolean[] char_set = new boolean[256];
		for(int i=0; i<S.length(); i++){
			int val = S.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testLetter;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write the test letter : ");
		
		testLetter = scan.nextLine();
		
		System.out.println("1. Letter : " + testLetter);
		System.out.println("2. Result : " + uniqueTest(testLetter));

	}

}
