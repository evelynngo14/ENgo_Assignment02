package cis3270.assignment02.chapter08;
//(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
//identical if their corresponding elements are equal. Write a method that returns
//true if m1 and m2 are strictly identical, using the following header:
//public static boolean equals(int[][] m1, int[][] m2)
//Write a test program that prompts the user to enter two 3 * 3 arrays of
//integers and displays whether the two are strictly identical.
//test inputs:
// 51 22 25 6 1 4 24 54 6
// 51 22 23 6 1 4 24 54 6
import java.util.Scanner;

public class q28 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                m2[i][j] = input.nextInt();
            }
        }
        System.out.print(equals(m1,m2) ?
                "The two arrays are strictly identical" :
                "The two arrays are not strictly identical");
    }
    public static boolean equals(int[][] m1, int[][] m2) {
        boolean identical = true;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j])
                    identical = false;
            }
        }
        return identical;
    }
}
