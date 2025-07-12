package anotherSnack;

public class NoOfEven {
    public static int noEvenIn(int[] a){
        int total = 0;
        for(int i=0; i<a.length; i++)
            if (a[i] % 2 == 0 ) total += 1;
        return total;
    }
    public static void main(String[] args){
        int[] a = {1, 3, 4, 5, 6,7 ,20};
        System.out.println(noEvenIn(a));
    }
}
