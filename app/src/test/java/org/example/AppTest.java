package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("こんにちは モンスターの世界へようこそ！", classUnderTest.getGreeting());
    }
}
