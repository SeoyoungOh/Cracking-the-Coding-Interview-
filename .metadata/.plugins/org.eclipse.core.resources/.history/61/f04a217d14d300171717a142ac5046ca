package _2_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class _4_Partition {
	public static LinkedList<Integer> partitionX(LinkedList<Integer> n, int x){
		LinkedList<Integer> small = new LinkedList();
		LinkedList<Integer> big = new LinkedList();
		for(int i = 0; i<n.size(); i++){
			int j = n.get(i);
			if(j<x)
				small.add(j);
			else
				big.add(j);
		}
		n.clear();
		small.sort(null);
		big.sort(null);
		n = small;
		n.addAll(big);
		return n;
	}

	public static void main(String[] args) {
		Integer[] test = new Integer[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<10; i++){
			System.out.println("Please enter the integer : ");
			test[i] = scan.nextInt();
		}
		LinkedList testList = new LinkedList();
		LinkedList resultList = new LinkedList();
		
		System.out.println("List Contents : ");
		
		for(Integer t : test){
			testList.add(t);
			System.out.println(t);
		}
		System.out.println("");
		
		System.out.println("Please enter the X : ");
		int x = scan.nextInt();
		
		
		resultList = partitionX(testList, x);
		
		for(int i=0; i<resultList.size(); i++){
			System.out.println(resultList.get(i));
		}
		

	}

}
