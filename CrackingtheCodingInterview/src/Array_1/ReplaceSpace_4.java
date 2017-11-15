package Array_1;

import java.util.Scanner;

/* 1.4. �־��� ���ڿ� ���� ��� ������ '%20'���� �ٲٴ� �޼��� �ۼ�
 * - ���ڿ� ���� �߰��� �ʿ��� ���ڵ��� ���� �� �ִ� ����� ������ �ִٰ� ����
 * - ������ �����ϴ� ���ڿ��� ���̵� �Բ� �־����ٰ� ����
 * - Java�� ��� ���� �迭�� ����Ͽ� �ʿ��� ������ �� ���ڿ� �ٷ� ������ �� �ֵ��� �� ��
 * - Input �迭�� ����� ������ �ִٰ� ����
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
