package com.stackroute.PE3;
import java.util.*;
import java.io.*;
public class StudentMarks {


    //this function checks whether the marks in the array is within a valid range
      public String checkRange(int number, int[] marksArray) {

          for(int i=0;i<number;++i) {
              String marks = String.valueOf(marksArray[i]);
              if(marksArray[i] < 0 || marksArray[i] > 100 || !isNumber(marks)){ //checks whether the marks are within the permissible range
                  return "Invalid Marks";
              }
          }

          return "Valid marks";

      }

     //this function checks whether the input marks are numbers or not
        static boolean isNumber(String inputString)
        {
            for (int i = 0; i < inputString.length(); i++)
                if (Character.isDigit(inputString.charAt(i)) //checks whether each character in the string is a digit or not
                        == false)
                    return false;

            return true;
        }

}
