package anotherSnack;

public class maxAndMin {
    public static String maxAndMinIn(int[] a){
        int max = a[0];
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max) max=a[i];
            if(a[i]<min) min=a[i];
        }
        return max + " " +min;
    }
    public static void main(String[] args){
        int[] a = {1, 3, 4, 5, 6,7 ,20};
        System.out.println(maxAndMinIn(a));
    }
}
