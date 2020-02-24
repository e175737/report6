package jp.ac.uryukyu.ie.e175737;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.Scanner;

public class Gobang {
    public int[][] board;
    public String[] yAxis = {"A", "B", "C", "D", "E", "F", "G", "H"};//ｙ軸用のラベル


    /*コンストラクタ*/
    public Gobang() {
        // 盤面状態
        int size = 8;
        board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
    }

    // 盤面表示
    public void display(Gobang gobang){

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


    public void play(Gobang gobang, int player) {

        System.out.println("\n ###################################\n");
        System.out.println("player" + player + "の番です。置く場所を入力してください。");
        System.out.println("入力例：A1");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String[] ar = input.split("");

        /*指定した入力か確認*/
        if(input.matches("^[A-H][1-8]$")) {
            int x = Integer.parseInt(ar[1]) - 1;

            for (int i = 0; i < 8; i++) {
                if (yAxis[i].equals(ar[0])) {

                    /*すでに置かれている場所に置けないようにする*/
                    if (gobang.board[i][x] == 0){
                        gobang.board[i][x] = player;
                        gobang.display(gobang);
                    } else{
                        System.out.println("すでに置かれている場所です。");
                    }
                    break;
                }
            }

        } else {
            System.out.println("例のように入力してください。");
        }
    }



}




