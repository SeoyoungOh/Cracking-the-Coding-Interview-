package Array_1;

import java.util.Scanner;

/* 1.4. 주어진 문자열 내의 모든 공백을 '%20'으로 바꾸는 메서드 작성
 * - 문자열 끝에 추가로 필요한 문자들을 더할 수 있는 충분한 공간이 있다고 가정
 * - 공백을 포함하는 문자열의 길이도 함께 주어진다고 가정
 * - Java의 경우 문자 배열을 사용하여 필요한 연산을 각 문자에 바로 적용할 수 있도록 할 것
 * - Input 배열에 충분한 공간이 있다고 가정
 * ex) Input  : "Mr John Smith", 13
 *     Output : "Mr%20John%20Smith" 
 * */
public class ReplaceSpace_4 {
	
	/* Twice Scanning
	 * - First scan : check empty space > length of string
	 * - Second scan : (scanning reverse) empty > %20 / non-empty > copy character 
	 * */
	public static void replaceSpace(char[] c, int length){
		int checkSpace = 0;
		//Fist Scanning
		for(char tmp : c){
			if(tmp == ' ')
				checkSpace++;
		}
		
		int newLength = length + checkSpace*2;
		c[newLength]='\0';
		--newLength;
						
		//Second Scanning
		for(int i=length-1; i>=0; --i){
			if(c[i] == ' '){
				c[newLength--] = '0';
				c[newLength--] = '2';
				c[newLength--] = '%';
			} else {
				c[newLength--] = c[i];
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testLetter;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write the test letter : ");
		testLetter = scan.nextLine();
		
		System.out.println("1. Input : " + "'" + testLetter + "' , '" + testLetter.length() + "'");
		char[] replaceLetter = new char[256];
		for(int i =0; i<testLetter.length(); i++){
			replaceLetter[i] = testLetter.charAt(i);
		}
		
		replaceSpace(replaceLetter, testLetter.length());
		
		String replacedLetter = new String(replaceLetter);
		System.out.println("2. Output : " + replacedLetter);
		

	}

}
