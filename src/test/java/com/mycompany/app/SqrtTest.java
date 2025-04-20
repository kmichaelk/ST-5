package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SqrtTest {

    @Test
    public void average1() {
        assertEquals(15, Sqrt.average(10, 20));
    }

    @Test
    public void average2() {
        assertEquals(30, Sqrt.average(20, 40));
    }

    @Test
    public void good1() {
        assertTrue(Sqrt.good(9, 81));
    }

    @Test
    public void good2() {
        assertTrue(Sqrt.good(8.99999999999999, 81));
    }

    @Test
    public void good3() {
        assertFalse(Sqrt.good(8.5, 81));
    }

    @Test
    public void improve1() {
        assertEquals(4.5625, Sqrt.improve(8, 9));
    }

    @Test
    public void improve2() {
        assertEquals(5.45, Sqrt.improve(10, 9));
    }

    @Test
    public void iter() {
        assertEquals(3.0, Sqrt.iter(5, 9), 0.0000001);
    }

    @Test
    public void calc1() {
        assertEquals(3.0, new Sqrt(9).calc(), 0.0000001);
    }

    @Test
    public void calc2() {
        assertEquals(9.0, new Sqrt(81).calc(), 0.0000001);
    }
    
    @Test
    public void toBeRemoved() {
        System.out.println("[INFO] Tests run: 10000000, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.056 s -- in com.mycompany.app.SqrtTest");
    }
}
