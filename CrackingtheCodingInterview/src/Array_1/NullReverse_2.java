package Array_1;

import java.util.Scanner;

/*
 * 1.2. 널 문자로 끝나는 문자열을 뒤집는 reverse(char* str)함수를 C나 C++로 작성하라*/


public class NullReverse_2 {
	
	/* - C의 경우
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
	
	/* 1.2. 문제 변형 - java 풀이 */
	public static String reverseJava(String s){
		return (new StringBuffer(s)).reverse().toString();
	}
	
	/* + 추가  
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
