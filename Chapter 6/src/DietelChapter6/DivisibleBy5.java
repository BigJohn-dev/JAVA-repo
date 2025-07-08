package DietelChapter6;

public class DivisibleBy5 {

    public static boolean isDivisibleBy5(double... numbers) {
            for (double number : numbers) {
                if (number % 5 == 0) return true;
            }
        return false;
    }

    public static boolean isDivisibleBy5(double number) {
        if (number % 5 == 0) return true;
        return false;
    }

    public static void main (String[] args) {
        System.out.println(DivisibleBy5.isDivisibleBy5(1.0, 2.0, 3.0, 4.0, 5.0, 6.0 , 7.0, 8.0, 9.0, 10.0));
        System.out.println(DivisibleBy5.isDivisibleBy5(55));
    }
}