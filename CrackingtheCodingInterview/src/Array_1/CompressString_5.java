package Array_1;
import java.util.Scanner;

/*
 * 1.5. ���� ���ڰ� �������� �ݺ��� ���,Ƚ���� ����� ���ڿ� �����ϴ� �޼��� ����
 * - ������ ���ڿ��� ���� ���ڿ����� ª������ �ʴ� ��� ���� ���ڿ� �״�� ��ȯ
 * - EX) aabccccccccaaa > a2b1c8a3
 *       abcda > a1b1c1d1a1 X > abcda*/
public class CompressString_5 {
	public static String compressString(String str){
		
		//���� ����� ���� ���ڿ����� ��������� �˻�
		int size = countCompresstion(str);
		if (size >= str.length())
			return str;
		
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1; i<str.length(); i++) {
			if(str.charAt(i)==last) //�ݺ��Ǵ� ���� ����
				count++;
			else {
				mystr.append(last); // ���ڳְ�
				mystr.append(count); // �ݺ� Ƚ�� �ְ�
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