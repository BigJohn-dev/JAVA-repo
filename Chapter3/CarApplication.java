
public class CarApplication {
    public static void main(String[] args) {

        car Car1 = new car("Benz", "2023", 2300.50);
        car Car2 = new car("C300", "2024", 4600.50);

        double price = Car1.getPrice();
        double price2 = Car2.getPrice();

        System.out.println("The car1 price before discount is " + price);
        System.out.println("The car2 price before discount is " + price2);

        double discount1 = Car1.getPrice() * 0.05;
        double discount2 = Car2.getPrice() * 0.07;

        System.out.println("The car1 price after discount is " + discount1);
        System.out.println("The car2 price after discount is " + discount2);

    }
}
