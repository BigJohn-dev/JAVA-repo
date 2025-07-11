package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TakingUserInputToSetUpAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of row for array:");
        int row = input.nextInt();
        System.out.println("Please enter the size of column for array:");
        int column = input.nextInt();

        int[][] array = new int[row][column];
        System.out.println("Please enter the elements of array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
}
