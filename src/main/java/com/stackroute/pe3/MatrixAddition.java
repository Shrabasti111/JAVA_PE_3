package com.stackroute.PE3;

public class MatrixAddition {

    //function  that adds the two input matrices
      public int[][] addMatrix(int[][] matrix, int[][] anotherMatrix) {
          int rowMatrix = matrix.length;
          int columnMatrix = matrix[0].length;
          int rowAnotherMatrix = anotherMatrix.length;
          int columnAnotherMatrix = anotherMatrix[0].length;
          int result[][] = new int[rowMatrix][columnMatrix]; //matrix containing the result to be returned

          for(int i=0;i<rowAnotherMatrix;++i) {
              for(int j=0; j<columnAnotherMatrix; ++j) {
                  result[i][j] = matrix[i][j] + anotherMatrix[i][j]; //stores the sum of the two matrices in the result matrix
              }
          }

          return result; //returns the result matrix
      }

      //function that checks whether the dimension of the two input matrices are same or not
      public String checkDimensions(int rowMatrix, int rowAnotherMatrix) {
          if(rowMatrix == rowAnotherMatrix){
              return "success";
          } else {
              return "failure";
          }
      }

}
