package Array_1;

import java.util.Scanner;

/*
 * 1.3. 문자열 두 개를 입력으로 받아 그중 하나가 다른 하나의 순열인지 판별하는 메서드 작성
 * - 문자의 길이가 다르면 서로 순열 관계에 있을 수 없음
 * - 대소문자 구별 따져야 하는지 확인할 것
 * - 공백을 어떻게 처리할지 확인 할 것
 * - 문자 집합으로 ASCII 사용하는지 등 문자 집합 크기 확인 할 것*/

public class TestPermutation_3 {
	/* 1. 정렬 후 비교하는 방법*/
	public static String sort(String s){
		char[] tmp = s.toCharArray();
		java.util.Arrays.sort(tmp);
		return new String(tmp);
	}
	
	public static boolean test1Permu(String s1, String s2){
		if (s1.length()!=s2.length())
			return false;
		return sort(s1).equals(sort(s2));
	}
	
	/* 2. 문자 출현 횟수 비교 방법*/
	public static boolean test2Permu(String s1, String s2){
		if (s1.length()!=s2.length())
			return false;
		int[] letters = new int[256]; //가정
		
		char[] s1_array = s1.toCharArray();
		for(char c: s1_array )
			letters[c]++;
		
		for(int i=0; i<s2.length(); i++){
			int c = (int) s2.charAt(i);
			if(--letters[c] < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testLetter1;
		String testLetter2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write the test letter 1 : ");
		
		testLetter1 = scan.nextLine();
		
        System.out.println("Please write the test letter 2 : ");
		
		testLetter2 = scan.nextLine();
		
		System.out.println("1. Letter1 : " + testLetter1);
		System.out.println("2. Letter2 : " + testLetter2);
		
		System.out.println("3. test1Permu : " + test1Permu(testLetter1, testLetter2));
		System.out.println("4. test2Permu : " + test2Permu(testLetter1, testLetter2));


	}

}
