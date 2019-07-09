package com.stackroute.PE3;

public class ExceptionType {
    public static void main(String[] args) {
        try {
            throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException exception1) {
            System.out.println(exception1.toString());
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException exception2) {
            System.out.println(exception2.toString());
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException exception3) {
            System.out.println(exception3.toString());
        }
    }
}
