package subsetUsingRecursion;
import java.util.*;

public class subsetSequence {
	public static void main(String[] args) {
		seq("", "abc");
		System.out.print(seqArray(" ", "abc"));
	}
	
	public static void seq(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p + " ");
			return;
		}
		
		seq(p+ up.charAt(0), up.substring(1));
		seq(p, up.substring(1));
	}
	
	public static ArrayList<String> seqArray(String p, String up) {
		ArrayList list = new ArrayList<String>();
		if(up.isEmpty()) {
			list.add(p);
			return list;
		}
		
		ArrayList left = seqArray(p+ up.charAt(0), up.substring(1));
		ArrayList right = seqArray(p, up.substring(1));
		
		left.addAll(right);
		return left;
	}
}
