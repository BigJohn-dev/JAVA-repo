package DietelChapter6;

public class ValueOf {
    public static void main(String[] args) {
        double a = Math.abs(-7.5);
        double b = Math.floor(5 + 2.5);
        double c = Math.abs(9) + Math.ceil(2.2);
        double d = Math.ceil(-5.2);
        double e = Math.abs(-5) + Math.abs(4);
        double f = Math.ceil(-6.4) - Math.floor(5.2);
        double g = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        System.out.println("The value of c is: " + c);
        System.out.println("The value of d is: " + d);
        System.out.println("The value of e is: " + e);
        System.out.println("The value of f is: " + f);
        System.out.println("The value of g is: " + g);
    }
}
