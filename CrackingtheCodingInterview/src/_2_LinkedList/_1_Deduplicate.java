package _2_LinkedList;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * 2.1. unsorted linked list에서 중복 문자 제거
 * - 연관 문제 > 임시버퍼 허용되지 않는 상황에서 해결 */

public class _1_Deduplicate {
	public static void deleteDupsWithBufferRemove(LinkedList<String> n){
		Hashtable table = new Hashtable();
		for(int i=0; i<n.size(); i++){
			if(table.containsKey(n.get(i))){
				n.remove(i); //  remove가 안되서 새로 리스트를 추가해서 담는 방법으로 변경
				i--;
			} else {
				table.put(n.get(i), true);
			}
		}
	}
	
	public static LinkedList<String> deleteDupsWithBuffer(LinkedList<String> n){
		Hashtable table = new Hashtable();
		LinkedList<String> deDupList = new LinkedList();
		for(int i=0; i<n.size(); i++){
			if(table.containsKey(n.get(i))){
				n.remove(i); // remove가 안되서 새로 리스트를 추가해서 담는 방법으로 변경
				i--;
			} else {
				table.put(n.get(i), true);
				String s = n.get(i);
				deDupList.add(s);
			}
		}
		return deDupList;
	}
	
	public static LinkedList<String> deleteDupsWithoutBuffer(LinkedList<String> n){
		//버퍼 없는 경우
		
		LinkedList<String> runner = new LinkedList();
		LinkedList<String> result = new LinkedList();
		runner = n;
		for(int i=0; i<n.size(); i++) {
			String s = n.get(i);
			for(int j=0; j<runner.size(); j++){
				String ss = runner.get(j);
				if(ss == s){
					n.remove(i);
					i--;
				}
			}
			result.add(s);
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		String[] test = new String[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<5; i++){
			System.out.println("Please enter the string : ");
			test[i] = scan.next();
		}
		LinkedList testList = new LinkedList();
		LinkedList resultList1 = new LinkedList();
		LinkedList resultList2 = new LinkedList();
		
		System.out.println("List Contents : ");
		
		for(String s : test){
			testList.add(s);
			System.out.println(s);
		}
		System.out.println("");
		
		resultList1.addAll(deleteDupsWithBuffer(testList));
		
		System.out.println("After delete duplicate1 : ");
		
		for(int i = 0; i<resultList1.size(); i++){
			System.out.println(resultList1.get(i));
		}
		System.out.println("");
		
		resultList2.addAll(deleteDupsWithoutBuffer(testList));
		
		System.out.println("After delete duplicate2 : ");
		
		for(int i = 0; i<resultList2.size(); i++){
			System.out.println(resultList2.get(i));
		}
		System.out.println("");

	}

}
