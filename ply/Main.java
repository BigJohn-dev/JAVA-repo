import java.util.Scanner;

public class Main {

    public static void sumNumbers() {
        int total = 0;
        for(int i = 1; i < 1001; i++) {
            total += i;
        }
        System.out.println(total);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            sumNumbers();
        }

        scanner.close();
    }
}
