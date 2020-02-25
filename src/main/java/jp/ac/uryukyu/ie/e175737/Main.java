package jp.ac.uryukyu.ie.e175737;

/**
 * メインメソッド。ゲームを実行する。
 * 盤が埋まるまでプレイヤーの2人のターンを交互に回す。
 */
public class Main {
    public static void main(String[] args) {

        Gobang gobang = new Gobang();

        System.out.println("\n #####################################\n");
        System.out.println(" 五目並べをスタートします。");
        gobang.display();

        for (int i = 0; i < 32; i++) {
            gobang.play(1);
            gobang.play(2);
        }
        System.out.println("盤面がいっぱいになりました。");
    }
}
