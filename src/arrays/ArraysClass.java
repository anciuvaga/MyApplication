package arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int [][] board = new int [4][4];

        // let's loop through array to populate board
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                board[row][col] = row * col;
            }
        }
        // let's loop through and print each row and column
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                board[row][col] = row * col;
                System.out.printf(board[row][col] + "\t");
            }
            System.out.println();
        }
    }
}


