package anotherSnack;

public class sumEven {
    public static int sumEvenIn(int[] a){
        int total = 0;
        for(int i=0; i<a.length; i++)
            if (a[i] % 2 == 0 ) total += a[i];
        return total;
    }
    public static void main(String[] args){
        int[] a = {1, 3, 4, 5, 6,7 ,20};
        System.out.println(sumEvenIn(a));
    }
}
