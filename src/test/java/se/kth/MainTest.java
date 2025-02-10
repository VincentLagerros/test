package se.kth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void testValid(){
        int result = Main.test(1, 2);
        assertEquals(3, result);
    }
}
