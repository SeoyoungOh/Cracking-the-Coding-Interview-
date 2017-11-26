package _2_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class _5_AddList {
	
	public static LinkedList<Integer> addLists (LinkedList<Integer> n1, LinkedList<Integer> n2){
		int carry = 0;
		int counter = n1.size();
		
		LinkedList<Integer> reverseN1 = new LinkedList();
		LinkedList<Integer> reverseN2 = new LinkedList();
		LinkedList<Integer> resultList = new LinkedList();
		
		reverseN1 = reverseList(n1);
		reverseN2 = reverseList(n2);
		
		for(int i=0; i<counter; i++){
			int tmp = reverseN1.get(i)+reverseN2.get(i)+carry;
			if(tmp >= 10){
				tmp -= 10;
				carry = 1;
			} else
				carry = 0;
			resultList.add(tmp);
		}
		
		if(carry == 1)
			resultList.add(carry);
		
		resultList = reverseList(resultList);
		
		return resultList;
	}
	public static LinkedList<Integer> reverseList (LinkedList<Integer> n){
		LinkedList<Integer> reverseList = new LinkedList();
		for(int i=n.size()-1; i>-1; i--){
			int tmp = n.get(i);
			reverseList.add(tmp);
		}
		return reverseList;
	}

	public static void main(String[] args) {
		Integer[] test1 = new Integer[5];
		Integer[] test2 = new Integer[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<5; i++){
			System.out.println("Please enter the integer (1) : ");
			test1[i] = scan.nextInt();
		}
		for(int i = 0; i<5; i++){
			System.out.println("Please enter the integer (2) : ");
			test2[i] = scan.nextInt();
		}
		LinkedList testList1 = new LinkedList();
		LinkedList testList2 = new LinkedList();
		LinkedList resultList = new LinkedList();
		
		System.out.println("List Contents : ");
		
		for(Integer t : test1){
			testList1.add(t);
			System.out.print(t);
		}
		System.out.println("");
		for(Integer t : test2){
			testList2.add(t);
			System.out.print(t);
		}
		System.out.println("");
		
		
		resultList = addLists(testList1, testList2);
		System.out.println("Result : ");
		for(int i=0; i<resultList.size(); i++){
			System.out.print(resultList.get(i));
		}

	}

}
