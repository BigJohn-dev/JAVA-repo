package DietelChapter6;

public class RoundingNumbers {

    public static double round(double value){
        return Math.floor(value);
    }

    public static void main(String[] args) {
        double x = 7.5;
        double y = x + 2.0;

        System.out.println("The value of x before rounding is " + x);
        System.out.println("The value of y before rounding is " + y);
        System.out.println("The value of x after rounding is " + round(x));
        System.out.println("The value of y after rounding is " + round(y));
    }
}
