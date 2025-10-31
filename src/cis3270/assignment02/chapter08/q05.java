package cis3270.assignment02.chapter08;
//(Algebra: add two matrices) Write a method to add two matrices.
import java.util.Scanner;
public class q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.println("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
                }
        }
        addMatrices(matrix1, matrix2);


    }
    public static double[][] addMatrices(double[][] m1, double[][] m2) {
        double[][] sumMatrix = new double[3][3];
        double sum = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                sumMatrix[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sumMatrix;
    }
    public static String displaySum(double[][] m1, double[][] m2, double[][] sum) {

    }
}


