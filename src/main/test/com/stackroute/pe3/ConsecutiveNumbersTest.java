package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers consecutiveNumbers;

    @Before
    public void setUp() {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() {
        consecutiveNumbers = null;
    }

    @Test
    public void checkNonConsecutive() { //checks whether the result matches the expected output

        boolean actual = consecutiveNumbers.checkConsecutive("-98,-96,-95,-94,-93");

        assertFalse(actual);
    }

    @Test
    public void checkConsecutiveOne() { //checks whether the result matches the expected output

        boolean actual = consecutiveNumbers.checkConsecutive("54,53,52,51,50,49,48");

        assertTrue(actual);
    }

    @Test
    public void checkNonConsecutiveTwo() { //checks whether the result matches the expected output

        boolean actual = consecutiveNumbers.checkConsecutive("1,2,3,4,5,6,6");

        assertFalse(actual);
    }

}