package CodingInterviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Q. Flatten a list
 * Write a function to flatten the nesting in an arbitrary list of values.
 * Your program should work on the equivalent of this list:
 * [[1], 2, [[3, 4], 5], [[[]]], [[[6]]], 7, 8, []]
 * Where the correct result would be the list:
 * [1, 2, 3, 4, 5, 6, 7, 8]*/

public class FlattenList {
	
	public static List<Object> flattenNonRecursive(List<Object> list) {
	    List<Object> result = new ArrayList<>();
	    LinkedList<Object> stack = new LinkedList<>(list);
	    while (!stack.isEmpty()) {
	        Object e = stack.pop();
	        if (e instanceof List<?>){
	        	System.out.println("instanceof : "+ e);
	            stack.addAll(0, (List<?>)e);
	        }
	        else{
	        	System.out.println("add : " + e);
	            result.add(e);
	        }
	    }
	    return result;
	}

	public static void main(String[] args) {
		List<Object> treeList = a(a(1), 2, a(a(3,4), 5), a(a(a())), a(a(a(6))), 7, 8, a());
		List<Object> flatList = flattenNonRecursive(treeList);
		System.out.println(treeList);
		System.out.println("flatten : " + flatList);


	}
	
	private static List<Object> a(Object... a){
		return Arrays.asList(a);
	}

}
