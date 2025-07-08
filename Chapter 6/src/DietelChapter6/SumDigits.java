package DietelChapter6;

public class SumDigits {

    public static int sumDigits(int n) {
        int sum = 0;
        String str = String.valueOf(n);
        for (int i = 1; i <= str.length(); i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
}
