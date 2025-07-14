import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int j = scanner.nextInt();
        for(int i = 1; i <= j; i++) {
            int m = scanner.nextInt();
            total += m;
        }
        System.out.println(total);
    }
}

