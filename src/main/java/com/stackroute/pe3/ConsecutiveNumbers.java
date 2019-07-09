package com.stackroute.PE3;

public class ConsecutiveNumbers {

    //this function checks whether the input values are consecutive numbers or not
    public boolean checkConsecutive(String values) {
            boolean result = false;
            String[] integerArray = values.split(","); //splits the string and stores it in an integer array
            for (int i = 0; i < integerArray.length - 1; i++) {
                int difference = Integer.parseInt(integerArray[i + 1]) - Integer.parseInt(integerArray[i]); //calculates the difference between two values

                if (difference == 1 || difference == -1) { //checks whether their is a difference of 1 or more
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            return result; //returns the boolean value
        }
}
