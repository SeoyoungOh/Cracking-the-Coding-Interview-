package Array_1;

import java.util.Scanner;

/*
 * 1.8. 한 단어가 다른 단어에 포함된 문자열인지 판별하는 함수 구현
 * - 판별 함수 isSubstring 한번만 호출해서 판별
 * ex) s1 : waterbottle
 *     s2 : erbottlewat
 *     이런경우  true (s1을 회전시켜서 s2가 생성 가능)*/
public class _8_isSubstring {
	public static boolean isSubstring(String s1, String s2){
		if(s1.length()==s2.length()&& s1.length()>0){
			String bigS1 = s1+s1;
			return (bigS1.indexOf(s2)!=-1);
		}
		return false;
	}

	public static void main(String[] args) {
		String s1, s2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first string : ");
		s1 = scan.nextLine();
		System.out.println("Please enter the second string : ");
		s2 = scan.nextLine();
		
		System.out.println("1. Input : "+ s1 + " ,  " + s2);
		System.out.println("2. Output : " + isSubstring(s1,s2));

	}

}
