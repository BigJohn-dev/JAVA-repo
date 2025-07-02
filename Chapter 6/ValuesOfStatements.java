
public class ValuesOfStatements {
    public static void main(String[] args) {

        double var1 = Math.abs((double)-7.5F);
        double var3 = Math.floor((double)7.5F);
        double var5 = (double)Math.abs(9) + Math.ceil(2.2);
        double var7 = Math.ceil(-5.2);
        double var9 = (double)(Math.abs(-5) + Math.abs(4));
        double var11 = Math.ceil(-6.4) - Math.floor(5.2);
        double var13 = Math.ceil(-Math.abs((double)-3.0F + Math.floor((double)-2.5F)));

        System.out.println(var1);
        System.out.println(var3);
        System.out.println(var5);
        System.out.println(var7);
        System.out.println(var9);
        System.out.println(var11);
        System.out.println(var13);
    }
}
