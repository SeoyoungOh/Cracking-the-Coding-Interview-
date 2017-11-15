package Array_1;

import java.util.Scanner;

/*
 * 1.1. ���ڿ��� ���Ե� ���ڵ��� ���� ���������� �˻��ϴ� �˰��� ����
 * - ��� �ٸ� �ڷᱸ���� ����� �� ���� ��Ȳ
 * */

public class UniqueString_1 {
	/* - ���ڿ��� ASCII ���� �����ڵ����� ���� ���� �� �� (ASCII ��� ����)
	 * 1. ���ڿ��� ���̰� ���� ���� ũ�⺸�� Ŭ ��� false ��ȯ
	 * 2. ���� ���ҿ� �ι� �����ϸ� �ٷ� false ��ȯ
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
