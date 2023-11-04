package subsetUsingRecursion;
import java.util.*;
public class ObstacleMaze {

	public static void main(String[] args) {
		boolean[][] board = {
				      /*c0*/ /*c1*/ /*c2*/
				/*r0*/{true, false, true, true},
				/*r1*/{false, false, true, true},
				/*r2*/{true, true, true, true}
		};
		
		mazeWithObstacles(board, "", 0, 0);
	}

	public static void mazeWithObstacles(boolean[][] maze, String p, int row, int col) {
//		System.out.print(Arrays.toString(maze[col]));
		if(row == 2 && col == maze[col].length -1) {
			System.out.print(p + " ");
			return;
		}
		
		if(row == maze[row].length -1) {
			mazeWithObstacles(maze, p+"R", row, col+1);
			return;
		}
		
		if(col == maze[col].length - 1) {
			mazeWithObstacles(maze, p+"D", row+1, col);
			return;
		}
		
		if(maze[row][col] == true) {
			mazeWithObstacles(maze, p+"D", row+1, col);
			mazeWithObstacles(maze, p+"R", row, col+1);
		}else {
			return;
		}
	}
}
