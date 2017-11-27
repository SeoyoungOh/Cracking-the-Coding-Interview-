package _3_Stack;

import java.util.Stack;

public class _2_StackWithMin extends Stack<Integer>{
	Stack<Integer> s;
	public _2_StackWithMin() {
		s = new Stack<Integer>();
	}
	
	public void push(int value){
		if(value <=min()){
			s.push(value);
		}
		super.push(value);
	}
	
	public Integer pop() {
		int value = super.pop();
		if(value == min()){
			s.pop();
		}
		return value;
	}
	
	public int min() {
		if(s.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		else {
			return s.peek();
		}
	}
}
