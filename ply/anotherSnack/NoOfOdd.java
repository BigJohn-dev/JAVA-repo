package anotherSnack;

public class NoOfOdd {
    public static int noOddIn(int[] a){
        int total = 0;
        for(int i=0; i<a.length; i++)
            if (a[i] % 2 == 1 ) total += 1;
        return total;
    }
    public static void main(String[] args){
        int[] a = {1, 3, 4, 5, 6,7 ,20};
        System.out.println(noOddIn(a));
    }
}
