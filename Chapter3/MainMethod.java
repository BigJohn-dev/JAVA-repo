public class MainMethod {
    public static void main(String[] args) {
        Method method = new Method("John", 5000.0);

        method.withdraw(3000);
        System.out.println(method.getBalance());

    }
}