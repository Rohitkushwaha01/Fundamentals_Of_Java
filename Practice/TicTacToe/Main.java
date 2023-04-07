import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // initailizing with empty rows and cols.
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        boolean matchfound = false;
        char player = 'X';
        Scanner sc = new Scanner(System.in);

        while (!matchfound) {
            printBoard(board);
            System.out.println("Player " + player + " turn: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // try-catch for arrayIndexOutOfBoundsExcetion.
            try {
                if (board[row][col] == ' ') {
                    board[row][col] = player;
                    matchfound = hasWon(board, player);
                    if (matchfound) {
                        printBoard(board);
                        System.out.print("Congratulation!!, Player " + player + " Won Game");
                        matchfound = true;
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Invalid Move!!!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please Enter number between 0 & 2");
            }

        }
    }

    // full board printing function
    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("| " + board[row][col] + " |");
            }
            System.out.println();
        }
    }

    // Function to check whether any player has won the game or not.
    public static boolean hasWon(char[][] board, char player) {
        // Checking Rows 
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // Checking Columns
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        // Checking Diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}