package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FirstLastDayWeekTest {

    FirstLastDayWeek firstLastDayWeek;

    @Before
    public void setUp() {
        firstLastDayWeek = new FirstLastDayWeek();

    }

    @After
    public void tearDown(){
        firstLastDayWeek = null;
    }

    @Test
    public void returnLastDayOfWeek() { //checks whether the result matches the expected output
        String result = firstLastDayWeek.calculateLastDayWeek();
        assertEquals("Sun 14/07/2019", result);
    }

    @Test
    public void returnFirstDayOfWeek() { //checks whether the result matches the expected output
        String result = firstLastDayWeek.calculateFirstDayWeek();
        assertEquals("Mon 08/07/2019", result);
    }

}