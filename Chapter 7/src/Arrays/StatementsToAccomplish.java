package Arrays;

import java.util.Arrays;

public class StatementsToAccomplish {
    public static void main(String[] args) {

        // display the value of the tenth element in arrays r
        int[] r = new int[10];
        r[9] = 1;
        for (int i : r) System.out.print(i + " ");
        System.out.println();

        // Initialize each of the six elements of one-dimensional integer arrays g to -1.
        int[] g = {-1, -1, -1, -1, -1, -1};
       System.out.print(Arrays.toString(g)+ " ");
        System.out.println();
       // Find the maximum of the first one-hundred elements of floating-point arrays c.
        int[] c = new int [100];
        c[55] = 30;
        c[12] = 48;
        // to find maximum elements
        int maximum = c[0];
        for (int i : c) if (i > maximum) maximum = i;
        System.out.println(maximum);

    }
}
