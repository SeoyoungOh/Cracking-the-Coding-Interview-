package Array_1;

import java.util.Scanner;

/*
 * 1.8. �� �ܾ �ٸ� �ܾ ���Ե� ���ڿ����� �Ǻ��ϴ� �Լ� ����
 * - �Ǻ� �Լ� isSubstring �ѹ��� ȣ���ؼ� �Ǻ�
 * ex) s1 : waterbottle
 *     s2 : erbottlewat
 *     �̷����  true (s1�� ȸ�����Ѽ� s2�� ���� ����)*/
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
