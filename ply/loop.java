public class loop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j < 2; j++) {
            System.out.println(i + " " + (i+j) + " " + (int)Math.pow(i, (i+j)));
        }
    }
}
}