package Module_1_Programming_Assignment_3;

import java.util.Scanner;

/**
 * Exercise 8.29 — Identical Arrays

- Prompts the user to enter two 3×3 integer arrays.
- Compares them using the equals(int[][], int[][]) method.
- Displays whether the two arrays are identical.
*/

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create two 3×3 integer arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        // Ask user for the first array (row by row)
        System.out.println("Enter the first 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt(); // store each value entered
            }
        }

        // Ask user for the second array
        System.out.println("Enter the second 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt(); // store each value entered
            }
        }

        // Compare both arrays using the equals method and show result
        if (equals(m1, m2))
            System.out.println("The two arrays are identical.");
        else
            System.out.println("The two arrays are not identical.");

        input.close();
    }
}
