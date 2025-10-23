import com.sun.tools.javac.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    public static void main(String[] args) {
        double[] salaries = {2340, 1720, 2350, 1890, 1100, 3900};
        double[] salaries2 = {1200, 1500, 900, 1900, 2100};
        double media = getSalaryMedian(salaries2);
        System.out.println("El sueldo medio seria: " + media);

    }

    public static double getSalaryMean(double[] salaries) {
        double suma = 0;
        for (int i = 0; i < salaries.length; i++) {
            suma += salaries[i];

        }

        return suma / salaries.length; // se divide para hacer la media
    }



    public static double getSalaryMedian(double[] salaries2) {
        int n = salaries2.length;
        if (n % 2 == 0) {
            // si es par, media de los 2 del centro.
            double central1 = salaries2[n / 2 - 1];
            double central2 = salaries2[n / 2];
            return (central1 + central2) / 2.0;
        } else {
            // si es impar, el del medio
            return salaries2[n / 2];
        }
    }

    ;

    public static double getPayroll(double salary, int children, double percentage, boolean disability) {
        double importe = 0;
        double childrenPercent = 0;
        double disabilityPlus = (disability) ? 500 : 0;
        if (children >= 3) {
            double childrenDouble = children;
            childrenPercent = (((childrenDouble - 2) * 3) + 2) / 100;
        } else {
            double childrenDouble = children;
            childrenPercent = childrenDouble / 100;
        }
        return salary - (salary * (percentage / 100 - childrenPercent)) + disabilityPlus; // + disabilityPlus;
    }


    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] matrixTrans = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixTrans[i][j] = matrix[j][i];
            }
        }
        return matrixTrans;
    }

};