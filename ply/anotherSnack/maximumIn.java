package anotherSnack;

public class maximumIn {
    public static int  maxIn(int[] a) {
        int max = a[0];
        for (int i= 0; i<a.length; i++){
            if(a[i] > max) max=a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] b = {10, 20,30, 40, 50};
        System.out.println(maximumIn.maxIn(b));
    }
}
