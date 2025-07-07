package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerDeckSize() {
        Player p = new Player("user");
        assertEquals(8, p.deck.size());
    }

    @Test
    public void testToStringFormat() {
        Player p = new Player("user");
        String output = p.toString();
        assertTrue(output.startsWith("Deck:user"));
        assertTrue(output.contains("レア度["));
    }
}
