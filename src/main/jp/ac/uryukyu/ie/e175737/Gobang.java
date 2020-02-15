package jp.ac.uryukyu.ie.e175737;

public class Gobang {
    public int[][] board;

    /*コンストラクタ*/
    public Gobang() {
        // 盤面状態
        /*int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
        };*/


        int size = 8;
        board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void display(Gobang gobang){
        String[] yAxis = {"A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"};//ｙ軸用のラベル

        // 盤面表示
        System.out.println();
        System.out.println("     1   2   3   4   5   6   7   8");
        System.out.println("   +---+---+---+---+---+---+---+---+");
        for (int i = 0; i < 8; i++) {
            System.out.print(" "+yAxis[i]);
            System.out.print(" |");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {
                    System.out.print(" ● |");
                } else if (board[i][j] == 2) {
                    System.out.print(" ○ |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
            System.out.println("   +---+---+---+---+---+---+---+---+");
        }
        System.out.println("\n   black：player1   white：player2");
    }

}

