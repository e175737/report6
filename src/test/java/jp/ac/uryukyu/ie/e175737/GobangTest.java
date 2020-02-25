package jp.ac.uryukyu.ie.e175737;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GobangTest {

    @Test
    void putStone() {
        Gobang gobang = new Gobang();
        String[] input = {"A", "1"};

        assertEquals(true, gobang.putStone(1, input));

        //同じところに置こうとしているのでfalseになるはず
        assertEquals(false, gobang.putStone(1, input));

    }
}