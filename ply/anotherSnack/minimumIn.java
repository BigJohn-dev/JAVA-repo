package anotherSnack;

public class minimumIn {
        public static int  minIn(int[] a) {
            int min = a[0];
            for (int i= 0; i<a.length; i++){
                if(a[i] < min) min=a[i];
            }
            return min;
        }
        public static void main(String[] args) {
            int[] b = {10, 20,30, 40, 50};
            System.out.println(minimumIn.minIn(b));
        }
    }