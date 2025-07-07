public class LuhnAlgorithm {

    // Method to check if the number is valid according to Luhn algorithm
    public static boolean isValid(String number) {
        int sum = 0;
        boolean alternate = false;

        // Process digits from right to left
        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);

            // Skip non-digit characters
            if (!Character.isDigit(c)) {
                return false;
            }

            int n = c - '0';

            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;  // Same as subtracting 9
                }
            }

            sum += n;
            alternate = !alternate;
        }

        // Valid if sum modulo 10 is zero
        return (sum % 10 == 0);
    }

    public static void main(String[] args) {
        String testNumber = "4532015112830366";  // Example Visa card number

        if (isValid(testNumber)) {
            System.out.println(testNumber + " is valid.");
        } else {
            System.out.println(testNumber + " is invalid.");
        }
    }
}
