package se.kth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void testAddition(){
        int result = Main.test(1, 2);
        assertEquals(3, result);
    }
    @Test
    public void testZeroEqualsZero(){
        int result = Main.test(0, 0);
        assertEquals(0, result);
    }
    @Test
    public void testNegativeNumbers(){
        int result = Main.test(-3, 2);
        assertEquals(-1, result);
    }
    @Test
    public void testLargeNumbers(){
        int result = Main.test(200000, 800000);
        assertEquals(1000000, result);
    }
}
