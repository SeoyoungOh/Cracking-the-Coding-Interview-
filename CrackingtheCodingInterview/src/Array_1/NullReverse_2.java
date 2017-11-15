package Array_1;

import java.util.Scanner;

/*
 * 1.2. �� ���ڷ� ������ ���ڿ��� ������ reverse(char* str)�Լ��� C�� C++�� �ۼ��϶�*/


public class NullReverse_2 {
	
	/* - C�� ���
	void reverse(char *str){
		char* end = str;
		char tmp;
		if (str) {
			while (*end) ++end;
		}
		--end;
		while(str<end){
			tmp = *str;
			*str++ = *end;
			*end-- = tmp;
		}
	}
	*/
	
	/* 1.2. ���� ���� - java Ǯ�� */
	public static String reverseJava(String s){
		return (new StringBuffer(s)).reverse().toString();
	}
	
	/* + �߰�  
	 * - input  : abcd efg hijkl
	 * - output : dcba egf lkjih */
	public static String reversePlus(String s){
		String[] array;
		array = s.split(" ");
		s = "";
		for(int i=0; i<array.length; i++){
			array[i] = (new StringBuffer(array[i])).reverse().toString();
			s += (array[i]+" ");
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverseString; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the letter to reverse : ");
		
		reverseString = scan.nextLine();
		
		System.out.println("1. string : " + reverseString);
		
		System.out.println("2. reverseJava : " + reverseJava(reverseString));
		
		System.out.println("3. reversePlus : " + reversePlus(reverseString));


	}

}
