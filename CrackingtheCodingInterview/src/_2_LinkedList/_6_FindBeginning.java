package _2_LinkedList;

public class _6_FindBeginning {
	public static LinkedListNode FindBeginning(LinkedListNode head){
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		/* Find collision spot
		 * LOOP_SIZE-k in linked list */
		while(fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		
		/* Checking error
		 * No collision > no loop */
		if(fast == null || fast.next == null)
			return null;
		
		/* Move slow to head 
		 * Fast in the collision point
		 * Beginning point of loop ~ k
		 * same speed -> meet */
		slow = head;
		while(slow!= fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		// Both pointing the start spot
		return fast;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
