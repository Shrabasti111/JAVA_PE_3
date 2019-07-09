package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels removeVowels;

    @Before
    public void setUp() {
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() {
        removeVowels = null;
    }

    @Test
    public void inputStringArrayReturnsStringArray() {  //checks whether the result matches the expected output
        String places[] = {"India", "United States", "Germany", "Egypt", "Czechoslovakia"};
        String result[] = removeVowels.removeVowels(places);
        String expected[] = {"nd","ntd stts","grmny","gypt","czchslvk"};
        assertArrayEquals(expected,result);
    }

    @Test
    public void inputStringArray1ReturnsStringArray() {  //checks whether the result matches the expected output
        String places[] = {"India", "", "Germany", "Egypt", "Czechoslovakia"};
        String result[] = removeVowels.removeVowels(places);
        String expected[] = {"nd","","grmny","gypt","czchslvk"};
        assertArrayEquals(expected,result);
    }

    @Test
    public void inputStringArray2ReturnsStringArray() {  //checks whether the result matches the expected output
        String places[] = {"India", "12345", "Germany", "Egypt", "Czechoslovakia"};
        String result[] = removeVowels.removeVowels(places);
        String expected[] = {"nd","12345","grmny","gypt","czchslvk"};
        assertArrayEquals(expected,result);
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullReturnException() {
        String places[] = {"India",null,null,"Egypt"};
        String result[] = removeVowels.removeVowels(places);
    }
}