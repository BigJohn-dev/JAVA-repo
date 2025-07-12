package anotherSnack;

import java.util.Scanner;

public class sumOf {
    public static int sumIn(int[] a){
        int total = 0;
        for(int i=0; i<a.length; i++) total += a[i];
        return total;
    }
    public static void main(String[] args){
        int[] a = {1, 3, 4, 5, 6,7 ,20};
        System.out.println(sumIn(a));
    }
}

