package Array_1;

import java.util.Scanner;

/*
 * 1.3. ���ڿ� �� ���� �Է����� �޾� ���� �ϳ��� �ٸ� �ϳ��� �������� �Ǻ��ϴ� �޼��� �ۼ�
 * - ������ ���̰� �ٸ��� ���� ���� ���迡 ���� �� ����
 * - ��ҹ��� ���� ������ �ϴ��� Ȯ���� ��
 * - ������ ��� ó������ Ȯ�� �� ��
 * - ���� �������� ASCII ����ϴ��� �� ���� ���� ũ�� Ȯ�� �� ��*/

public class TestPermutation_3 {
	/* 1. ���� �� ���ϴ� ���*/
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
	
	/* 2. ���� ���� Ƚ�� �� ���*/
	public static boolean test2Permu(String s1, String s2){
		if (s1.length()!=s2.length())
			return false;
		int[] letters = new int[256]; //����
		
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