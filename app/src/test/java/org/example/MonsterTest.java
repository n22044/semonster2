package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

  @Test
  public void testToString() {
    Monster m = new Monster("スライム", 1);
    assertEquals("スライム:レア度[1]", m.toString());
  }

  @Test
  public void testSummonMonster() {
    Monster m = Monster.summonMonster(0);
    assertEquals("デュラハン:レア度[0]", m.toString());
  }

  @Test
  public void testEvolveMonster() {
    Monster m = new Monster("スライム", 4);
    assertEquals("キングスライム:レア度[4]", m.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidRarity() {
    Monster.summonMonster(10); // 存在しないレア度
  }
}
