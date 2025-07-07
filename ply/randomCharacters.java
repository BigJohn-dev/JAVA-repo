public class randomCharacters {
    public static void main(String[] args) {
        int numLetters = 10; 

        System.out.print("Random letters: ");
        for (int i = 0; i < numLetters; i++) {
            // Generate a random uppercase letter (A to Z)
            char letter = (char) ('A' + (int)(Math.random() * 26));
            System.out.print(letter);
        }
        System.out.println();
    }
}
