package Array_1;
import java.util.Scanner;

/*
 * 1.5. 같은 문자가 연속으로 반복될 경우,횟수를 사용해 문자열 압축하는 메서드 구현
 * - 압축한 문자열이 원래 문자열보다 짧아지지 않는 경우 원래 문자열 그대로 반환
 * - EX) aabccccccccaaa > a2b1c8a3
 *       abcda > a1b1c1d1a1 X > abcda*/
public class CompressString_5 {
	public static String compressString(String str){
		
		//압축 결과가 원래 문자열보다 길어지는지 검사
		int size = countCompresstion(str);
		if (size >= str.length())
			return str;
		
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1; i<str.length(); i++) {
			if(str.charAt(i)==last) //반복되는 문자 개수
				count++;
			else {
				mystr.append(last); // 문자넣고
				mystr.append(count); // 반복 횟수 넣고
				last = str.charAt(i); 
				count = 1;
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}
	
	public static int countCompresstion(String str) {
		if(str == null || str.isEmpty())
			return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for(int i = 0; i< str.length(); i++){
			if(str.charAt(i) == last)
				count++;
			else {
				last = str.charAt(i);
				size += 1+String.valueOf(count).length();
				count = 1;
			}
		}
		
		size += 1+String.valueOf(count).length();
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testLetter;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write the test letter : ");
		
		testLetter = scan.nextLine();
		
		System.out.println("1. Input : " + testLetter);
		System.out.println("2. Output : " + compressString(testLetter));

	}

}