package subsetUsingRecursion;

// for paths function
// I/p = (3,3)
// O/p = no. of ways to reach their (6)

// for printPossiblePaths function
// I/p = (" ", 3, 3)
// O/p = DDRR DRDR DRRD RDDR RDRD RRDD

//for printPossiblePathsRet function
//I/p = (" ", 3, 3)
//O/p = [DDRR DRDR DRRD RDDR RDRD RRDD]

import java.util.*;

public class FindNoOfPathsMaze {

	public static void main(String[] args) {
//		System.out.print(paths(4,3));
//		printPossiblePaths(" ", 3, 3);
//		System.out.print(printPossiblePathsReturn("", 3, 3));
//		printPossiblePathsDiagonal(" ", 3, 3);
	}
	
	// code to just print possible no.of paths
	public static int paths(int row, int col) {
		if(row == 1 || col == 1) {
			return 1;
		}
		
		int left = paths(row-1, col);
		int right = paths(row, col-1);
		
		return left + right;
	}

	//  code to print paths 
	public static void printPossiblePaths(String p, int row, int col) {
		if(row == 1 && col == 1) {
			System.out.print(p);
			return;
		}
			
		if(row != 1) {
			printPossiblePaths(p+"D", row-1, col);
		}
		if(col != 1) {
			printPossiblePaths(p+"R", row, col-1);
		}
	}
	
	// code to print paths and add in array
	public static ArrayList printPossiblePathsReturn(String p, int row, int col) {
		ArrayList<String> list = new ArrayList<String>();
		if(row == 1 && col == 1) {
			list.add(p);
			return list;
		}
		if(row != 1) {
			list.addAll(printPossiblePathsReturn(p+"D", row-1, col));
		}
		if(col != 1) {
			list.addAll(printPossiblePathsReturn(p+"R", row, col-1));
		}
		
		return list;
	}
	

	//Code to Go Diagonally
	public static void printPossiblePathsDiagonal(String p, int row, int col) {
		if(row == 1 && col == 1) {
			System.out.print(p);
			return;
		}
			
		if(row != 1) {
			printPossiblePathsDiagonal(p+"D", row-1, col);
		}
		if(row !=1 && col != 1) { 
			printPossiblePathsDiagonal(p+"V", row-1, col-1);
		}
		if(col != 1) {
			printPossiblePathsDiagonal(p+"R", row, col-1);
		}
	}
}
