package _2_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 2.2. �ܹ��� ���� ����Ʈ����, �ڿ��� k��° ���� ã�� �˰�����
 * - k=1�� ������ ����*/
public class _2_FindLastKth {
	/* ��� 1 : ���Ḯ��Ʈ�� ���̸� �˰� ���� �� 
	 *  length-k ��° ���� ��ȯ */
	public static int kthToLastWithLength(LinkedList<Integer> n, int k){
		int i = n.size()-k;
		i = n.get(i);
		return i;
	}
	
	/* ��� 2-1 : ����� ��� 
	 *  ���Ҹ� ��ȯ���� �ʰ� ��¸� �ѵ�, ī���� ��ȯ*/
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
	/* ��� 2-2 : ����� ��� 
	 *  ������ ���� �� ���� Ȱ��
	 *  å�� ��� c++*/
	/*
	public static int kthToLastWithRecurTwo(LinkedList<Integer> n, int k){
		int i=0;
		return i;
	}
	*/
	/* ��� 2-3 : ����� ��� 
	 *  wrapper Ŭ���� ����*/
	/*
	public static int kthToLastWithRecurThree(LinkedList<Integer> n, int k){
		int i=0;
		return i;
	}
	*/
	/* ��� 3 : ��ȯ�� ���*/
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