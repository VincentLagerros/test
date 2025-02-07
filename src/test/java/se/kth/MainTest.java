package se.kth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void testValid(){
        boolean result = Main.test();
        assertTrue(result);
    }

    @Test
    public void testInvalid(){
        boolean result = Main.test();
        assertFalse(!result);
    }
}
