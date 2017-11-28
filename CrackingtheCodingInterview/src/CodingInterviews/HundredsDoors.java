package CodingInterviews;

import java.util.Arrays;

/* Q. 100 doors
 * There are 100 doors in a row that are all initially closed.
 * You make 100 passes by the doors.
 * The first time through, visit every door and toggle the door(if the door is closed, open it; if it is open, close it).
 * The second time, only visit every 2nd door and toggle it.(#2, #4, #6 ... )
 * The third time, visit every 3rd door, etc, until you only visit the 100th door.
 * 
 * > What state are the doors in after the last pass? Which are open, which are closed?
 * */

/* open = true / close = false => boolean
 *      1 2 3 4 5 6 7 8 9 10 
 *  1 : t t t t t t t t t t <1>
 *  2 : t f t f t f t f t f (2)
 *  3 : t f f f t t t f f t (3)
 *  4 : t f f t t t t t f t <4>
 *  odd 
 *   > 1 : 1
 *   > 3 : square*/

public class HundredsDoors {
	public static void HundredDoors(boolean[] doors){
		for(int i = 1; i<doors.length; i++){
			for(int j=i; j<doors.length; j += i){
				doors[j] =! doors[j];
			}
		}
		for(int i=1; i<doors.length; i++){
			if(doors[i])
				System.out.printf("The %d door is open %n", i);
		}
	}
	
	public static void simpleHundredDoors(boolean[] doors){
		for(int i=1; i<Math.sqrt(doors.length); i++){
			System.out.printf("The %d door is open %n", i*i);
		}
	}
	
	

	public static void main(String[] args) {
		boolean doors[] = new boolean[101];
		
		Arrays.fill(doors, false);
		System.out.println("Hundred Doors : ");
		HundredDoors(doors);
		
		Arrays.fill(doors, false);
		System.out.println("Simple Hundred Doors : ");
		simpleHundredDoors(doors);

	}

}
