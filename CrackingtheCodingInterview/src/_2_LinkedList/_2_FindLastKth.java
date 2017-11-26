package _2_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 2.2. 단방향 연결 리스트에서, 뒤에서 k번째 원소 찾는 알고리즘
 * - k=1이 마지막 원소*/
public class _2_FindLastKth {
	/* 방법 1 : 연결리스트의 길이를 알고 있을 떄 
	 *  length-k 번째 원소 반환 */
	public static int kthToLastWithLength(LinkedList<Integer> n, int k){
		int i = n.size()-k;
		i = n.get(i);
		return i;
	}
	
	/* 방법 2-1 : 재귀적 방법 
	 *  원소를 반환하지 않고 출력만 한뒤, 카운터 반환*/
	/*
	public static int kthToLastWithRecurOne(LinkedList<Integer> n, int k){
		if (n == null) return 0;
		//n.removeFirst();
		int i=kthToLastWithRecurOne(n, k)+1;
		if(i==k){
			System.out.println(n.get(i));
		}
		return i;
	}*/
	/* 방법 2-2 : 재귀적 방법 
	 *  참조를 통한 값 전달 활용
	 *  책의 경우 c++*/
	/*
	public static int kthToLastWithRecurTwo(LinkedList<Integer> n, int k){
		int i=0;
		return i;
	}
	*/
	/* 방법 2-3 : 재귀적 방법 
	 *  wrapper 클래스 구현*/
	/*
	public static int kthToLastWithRecurThree(LinkedList<Integer> n, int k){
		int i=0;
		return i;
	}
	*/
	/* 방법 3 : 순환적 방법*/
	/*
	public static int kthToLastWithIterate(LinkedList<Integer> n, int k){
		int i=0;
		return i;
	}
	*/

	public static void main(String[] args) {
		Integer[] test = new Integer[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<10; i++){
			System.out.println("Please enter the integer : ");
			test[i] = scan.nextInt();
		}
		LinkedList testList = new LinkedList();
		
		System.out.println("List Contents : ");
		
		for(Integer t : test){
			testList.add(t);
			System.out.println(t);
		}
		System.out.println("");
		
		System.out.println("Please enter the K (<10): ");
		int k = scan.nextInt();
		
		
		int result1 = kthToLastWithLength(testList,k);
		//int result2 = kthToLastWithRecurOne(testList, k);
		//int result3 = kthToLastWithRecurTwo(testList, k);
		//int result4 = kthToLastWithRecurThree(testList, k);
		//int result5 = kthToLastWithIterate(testList, k);
		
		System.out.println("result 1 : " + result1);
		//System.out.println("result 2 : " + result2);
		//System.out.println("result 3 : " + result3);
		//System.out.println("result 4 : " + result4);
		//System.out.println("result 5 : " + result5);
		


	}

}
