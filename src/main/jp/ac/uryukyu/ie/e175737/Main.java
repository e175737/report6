package jp.ac.uryukyu.ie.e175737;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gobang gobang = new Gobang();

        gobang.display(gobang);

        for (int i = 0; i < 3; i++) {
            gobang.play(gobang, 1);
            gobang.play(gobang, 2);
        }
    }
}
