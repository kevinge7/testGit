import java.util.Scanner;
import java.util.Arrays;


public class Main {
    static int row;
    static int colm;
    static char curPlayer = 'O';

    public static void swith() {
        if(curPlayer == 'X') {
            curPlayer = 'O';
        }
        else {
            curPlayer = 'X';
        }
    }


    public static void getBoard(char[][] board) {
        for(char[] row: board) {
            Arrays.fill(row,'*');
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for(char[] row : board ) {
            for(char c:row) {
                System.out.printf("%s  ",c);

            }
            System.out.println();
        }
    }


    public static boolean checkWin(char[][] board) {
        int num1 = 0;
        for (int i = 0; i < board.length;i++) {
            for(int j = 0; j < board[i].length-1; j ++){
            if(board[i][j] == board[i][j+1] && board[i][2] != '*') {
                return true;
            }
        }
        }
        for (int i = 0; i < board.length;i++) {
            for(int j = 0; j < board[i].length-1;j++){
            if(board[j][i] == board[j+1][i] && board[2][i] != '*') {
                return true;
            }
        }
        }
        if (board[0][0] == board[2][2] && board[2][2] == board[1][1]&& board[2][2] != '*') {
            return true;
        }
        if ( board[0][2] == board[1][1] && board[2][0] == board[1][1]&& board[1][1] != '*') {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe!");
        int times = 0;
        boolean result = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a board size: ");
        int size = input.nextInt();
        char[][] board=new char[size][size];
        getBoard(board);
        printBoard(board);
        while (!result && times != 9) {
            swith();
            System.out.println(curPlayer+": Please enter the row number:");
            row = input.nextInt()-1;
            if(row > size-1) {
                System.out.println("row number should be less than 3");
                swith();
                continue;
            }
            System.out.println(curPlayer+": Please enter the colume number:");
            colm = input.nextInt()-1;
            if (colm > size-1) {
                System.out.println("colume number should be less than 3");
                swith();
                continue;
            }

            if(board[row][colm] == '*') {
                board[row][colm] = curPlayer;
                printBoard(board);
                times += 1;
                result = checkWin(board);
            }
            else {
                System.out.println("error!");
                swith();
                continue;}
        }
        if (times == size * size && !result) {
            System.out.println("No Winner!");
        }
        else {
            System.out.println(curPlayer+" Wins!");
        }

    }
}
