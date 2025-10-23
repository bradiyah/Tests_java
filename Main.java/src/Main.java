import com.sun.tools.javac.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class Main {



}



public static void main(String[] args) {
  double[] salaries = {2340, 1720, 2350, 1890, 1100, 3900};
  double [] salaries2={1200, 1500, 900, 1900, 2100}
  double media = getSalaryMedian(salaries2);
  System.out.println("El sueldo medio seria: " + media);
}
public static double getSalaryMean(double[] salaries) {
  double suma = 0;
  for (int i = 0; i < salaries.length; i++) {
    suma += salaries[i];

  }

  return suma;
};

  public static double getSalaryMedian ( double[] salaries2) {
    int n = salaries2.length;
    if (n % 2 == 0) {
      double central1 = salaries2[n / 2 - 1];
      double central2 = salaries2[n / 2];
      return (central1 + central2) / 2.0;
    } else {
      return salaries2[n / 2];
    }
  };

    public static getPayroll( double salary, int children, double percentage, boolean disability) {


      public static void transposeMatrix ( double[][] matrix){

        int[][] matrix = {
            {1, 3, 4}
            {3, 4, 8}};

        for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
            System.out.println(matrix[i][j] + " ");

          }

          System.out.println();

        }

        int[][] matrixT = new int[matrix[0].length][matrix.length];

      }


    }

};


};