package basicArray;
import java.io.*;
import java.util.*;
public class Pot {

	public static void main(String[] args) {
		int[] arr = {2,1,2,3,1,4,5,6,1};
		System.out.print(pot2(10,7,arr));
	}
	
	// Easy way: with using hashSet
	public static int pot(int input1, int input2, int[] input3) {		
		 HashSet<Integer> set = new HashSet<>();
		 for(int i = 0; i<input2; i++) {
			 set.add(input3[i]);
		 }
		 return set.size();
	}
	
	
	// without using in-built functoins
	public static int pot2(int input1, int input2, int[] input3) {
		ArrayList<Integer> arr = new ArrayList();
		arr.add(input3[0]);
		for(int i = 0; i<input2; i++) {
			if(!helper(arr, input3[i])) {
				arr.add(input3[i]);
			}
		}
		return arr.size();
	}
	
	// iterate through the new array and check whether the element is present in the new array
	// if not present return true;
	// if present return false 
	public static boolean helper(ArrayList<Integer> arr, int element) {
		for(int i= 0; i<arr.size(); i++) {
			if(arr.get(i) == element) {
				return true;
			}
		}
		return false;
	}

}
