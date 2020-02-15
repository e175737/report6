package jp.ac.uryukyu.ie.e175737;

public class Main {
    public static void main(String[] args){

    Gobang gobang = new Gobang();

    gobang.board[0][0]=2;
    gobang.board[7][7]= 1;
    gobang.display(gobang);

    }
}
