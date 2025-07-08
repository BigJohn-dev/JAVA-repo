package DietelChapter6;

import java.util.Scanner;

public class TemperatureConversion {

    public static String convertToKelvin(double celsius) {
        double Kelvin = celsius + 273.15;
        return "Kelvin equivalent of Celsius temperature is: " + Kelvin;
    }

    public static String convertToCelsius(double kelvin) {
        double Celsius = kelvin - 273.15;
        return "Celsius equivalent of Kelvin temperature is: " + Celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose your conversion factor: ");
        String conversionFactor = """
                1. Kelvin
                2. Celsius
                """;
        System.out.println(conversionFactor);
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Please enter the temperature in Celsius: ");
            double celsius = input.nextDouble();
            System.out.println(TemperatureConversion.convertToCelsius(celsius));
        } else if (option == 2) {
            System.out.println("Please enter the temperature in Kelvin: ");
            double kelvin = input.nextDouble();
            System.out.println(TemperatureConversion.convertToKelvin(kelvin));
        } else {
            System.out.println("Please enter a valid option!");
        }
    }
}
