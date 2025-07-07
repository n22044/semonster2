package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

    @Test
    public void testToString() {
        Monster m = new Monster("ドラゴン", 4);
        assertEquals("進化したドラゴン:レア度[4]", m.toString());
    }

    @Test
    public void testSummonMonster() {
        Monster m = Monster.summonMonster(0);
        assertEquals("スライム:レア度[0]", m.toString());

        Monster m2 = Monster.summonMonster(3);
        assertEquals("進化したドラゴン:レア度[3]", m2.toString());
    }
}
