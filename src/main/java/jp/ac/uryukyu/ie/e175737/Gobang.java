package jp.ac.uryukyu.ie.e175737;

/**
 * 盤に関する処理をするクラス
 * 盤の入力を受け取り
 * int[][] board //盤の状態
 */

import java.util.Scanner;

public class Gobang {
    public int[][] board;
    public final String[] yAxis = {"A", "B", "C", "D", "E", "F", "G", "H"};//ｙ軸用のラベル

    /**
     * コンストラクタ。何も置かれていない状態の盤を生成する。
     *  盤の目の数(8×8)
     */
    public Gobang() {
        board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = 0;
            }
        }
    }

    /**
     * 盤の状態を表示するメソッド。
     * player1：●　, player2：○
     */
    public void display(){

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


    /**
     * 石を置くメソッド。
     * boolean ok //入力された場所に石を置けたかの判定
     * @param player プレイヤー
     * @param input 石を置く位置
     * @return 石が置けたかどうか
     */
    public boolean putStone(int player, String[] input) {
        boolean ok = false;

        int x = Integer.parseInt(input[1]) - 1;

        for (int i = 0; i < 8; i++) {
            if (yAxis[i].equals(input[0])) {

                //すでに石が置かれている場所に置けないようにする
                if (board[i][x] == 0){
                    board[i][x] = player;
                    display();
                    ok = true;

                } else{
                    System.out.println("すでに置かれている場所です。");
                    ok = false;
                }
                break;
            }
        }
        return ok;
    }


    /**
     * 入力を受け取り、石が置けるか判断するメソッド。
     * @param player
     */
    public void play(int player) {

        System.out.println("\n #####################################\n");
        System.out.println("player" + player + " の番です。石を置く場所を入力してください。(入力例：A1)");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] input = str.split("");
        boolean ok = false;

        //指定した入力か確認
        if(str.matches("^[A-H][1-8]$")) {
            ok = putStone(player, input);

        } else {
            System.out.println("例のように入力してください。");
            ok = false;

        }
        //石が置けなかった際にもう一度やり直す
        if (!ok){
            play(player);
        }
    }

}




