package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks studentMarks;

    @Before
    public void setUp() {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() {
        studentMarks = null;
    }

    @Test
    public void inputMarksDisplaySuccessMessage() { //checks whether the result matches the expected output
        int number = 5;
        int marks[] = {78,23,45,65,87};
        String result = studentMarks.checkRange(number, marks);
        assertEquals("Valid marks", result);
    }

    @Test
    public void inputInvalidMarksDisplayErrorMessage() { //checks whether the result matches the expected output
        int number = 5;
        int marks[] = {78,-23,45,65,87};
        String result = studentMarks.checkRange(number, marks);
        assertEquals("Invalid Marks", result);
    }

    @Test
    public void inputMarksDisplayMessage() { //checks whether the result matches the expected output
        int number = 3;
        int marks[] = {78,-3,33};
        String result = studentMarks.checkRange(number, marks);
        assertEquals("Invalid Marks", result);
    }



}