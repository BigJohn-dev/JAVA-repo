package DietelChapter6;

public class RoundingNumbersII {

    public static int round1(double value){
        double result = Math.round(value * 10 + 0.5) / 1;
        return (int)result;
    }
    public static double round10(double value){
        return Math.floor(value * 10 + 0.5) / 10;
    }
    public static double round100(double value){
        return  Math.floor(value * 10 + 0.5) / 100;
    }
    public static double round1000(double value){
        return Math.floor(value * 10 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        double a = round1(7.5);
        double b = round10(7.5);
        double c = round100(7.5);
        double d = round1000(7.5);
        System.out.println("The value of a before rounding: " + a);
        System.out.println("The value of a after rounding to integer: " + a);
        System.out.println();
        System.out.println("The value of b before rounding: " + b);
        System.out.println("The value of b after rounding To tenths : " + b);
        System.out.println();
        System.out.println("The value of c before rounding: " + c);
        System.out.println("The value of c after rounding To Hundredths: " + c);
        System.out.println();
        System.out.println("The value of d before rounding: " + d);
        System.out.println("The value of d after rounding To Thousandths: " + d);
    }
}
