package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition  matrixAddition;

    @Before
    public void setUp() {
        matrixAddition = new MatrixAddition();
    }

    @After
    public void tearDown(){
        matrixAddition = null;
    }

    @Test
    public void inputTwoMatricesReturnsSum() {  //checks whether the result matches the expected output
        int[][] matrix = { {2,3,1}, {4, 2, 1} };
        int[][] anotherMatrix = {{3,2,1},{2,4,5}};
        int rowMatrix = matrix.length;
        int rowAnotherMatrix = anotherMatrix.length;
        String message = matrixAddition.checkDimensions(rowMatrix, rowAnotherMatrix);
        if(message == "success") {
            int[][] result = new int[2][3];
            result = matrixAddition.addMatrix(matrix, anotherMatrix);
            int check[] = {5, 5, 2};
            int anotherCheck[] = {6, 6, 6};
            assertArrayEquals(check, result[0]);
            assertArrayEquals(anotherCheck, result[1]);
        }
    }

    @Test
    public void inputAnotherTwoMatricesReturnsSum() { //checks whether the result matches the expected output
        int[][] matrix = {{2, -3, 1}, {4, 2, 1}};
        int[][] anotherMatrix = {{3, 2, 1}, {2, -4, 5}};
        int rowMatrix = matrix.length;
        int rowAnotherMatrix = anotherMatrix.length;
        String message = matrixAddition.checkDimensions(rowMatrix, rowAnotherMatrix);
        if (message == "success") {
            int[][] result = new int[2][3];
            result = matrixAddition.addMatrix(matrix, anotherMatrix);
            int check[] = {5, -1, 2};
            int anotherCheck[] = {6, -2, 6};
            assertArrayEquals(check, result[0]);
            assertArrayEquals(anotherCheck, result[1]);
        }

    }

        @Test
        public void inputTwoMatricesReturnsFailure() { //checks whether the result matches the expected output
            int[][] matrixNew = { {2,-3,1}, {4, 2, 1}, {2,3,1} };
            int[][] anotherMatrixNew = {{3,2,1},{2,-4,5}};
            int rowMatrixNew = matrixNew.length;
            int rowAnotherMatrixnew = anotherMatrixNew.length;
            String message = matrixAddition.checkDimensions(rowMatrixNew, rowAnotherMatrixnew);
            assertEquals("failure", message);


    }


}