package _2_LinkedList;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * 2.1. unsorted linked list���� �ߺ� ���� ����
 * - ���� ���� > �ӽù��� ������ �ʴ� ��Ȳ���� �ذ� */

public class _1_Deduplicate {
	public static LinkedList<String> deleteDupsWithBuffer(LinkedList<String> n){
		Hashtable table = new Hashtable();
		LinkedList<String> deDupList = new LinkedList();
		for(int i=0; i<n.size(); i++){
			if(table.containsKey(n.get(i))){
				System.out.println("remove : " + n.get(i));
				n.remove(i);
				i--;
			} else {
				System.out.println("add : " + n.get(i));
				table.put(n.get(i), true);
				String s = n.get(i);
				deDupList.add(s);
			}
		}
		return deDupList;
	}
	
	public static void deleteDupsWithoutBuffer(LinkedList<String> n){
		
	}

	public static void main(String[] args) {
		String[] test = new String[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<5; i++){
			System.out.println("Please enter the string : ");
			test[i] = scan.next();
		}
		LinkedList testList = new LinkedList();
		LinkedList resultList = new LinkedList();
		
		System.out.println("List Contents : ");
		
		for(String s : test){
			testList.add(s);
			System.out.println(s+" ");
		}
		System.out.println("");
		
		resultList.addAll(deleteDupsWithBuffer(testList));
		
		System.out.println("After delete duplicate : ");
		
		for(int i = 0; i<resultList.size(); i++){
			System.out.println(resultList.get(i));
		}
		System.out.println("");
		

	}

}