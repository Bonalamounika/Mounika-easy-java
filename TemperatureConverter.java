import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTemperature Converter Menu:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Convert Celsius to Kelvin");
            System.out.println("4. Convert Kelvin to Celsius");
            System.out.println("5. Convert Fahrenheit to Kelvin");
            System.out.println("6. Convert Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsiusToFahrenheit = scanner.nextDouble();
                    double convertedFahrenheit = celsiusToFahrenheitToFahrenheit(celsiusToFahrenheit);
                    System.out.println("Temperature in Fahrenheit: " + convertedFahrenheit);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitToCelsius = scanner.nextDouble();
                    double convertedCelsius = fahrenheitToCelsiusToCelsius(fahrenheitToCelsius);
                    System.out.println("Temperature in Celsius: " + convertedCelsius);
                    break;
                case 3:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsiusToKelvin = scanner.nextDouble();
                    double convertedKelvin1 = celsiusToKelvin(celsiusToKelvin);
                    System.out.println("Temperature in Kelvin: " + convertedKelvin1);
                    break;
                case 4:
                    System.out.print("Enter temperature in Kelvin: ");
                    double kelvinToCelsius = scanner.nextDouble();
                    double convertedCelsius1 = kelvinToCelsius(kelvinToCelsius);
                    System.out.println("Temperature in Celsius: " + convertedCelsius1);
                    break;
                case 5:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitToKelvin = scanner.nextDouble();
                    double convertedKelvin2 = fahrenheitToKelvin(fahrenheitToKelvin);
                    System.out.println("Temperature in Kelvin: " + convertedKelvin2);
                    break;
                case 6:
                    System.out.print("Enter temperature in Kelvin: ");
                    double kelvinToFahrenheit = scanner.nextDouble();
                    double convertedFahrenheit1 = kelvinToFahrenheit(kelvinToFahrenheit);
                    System.out.println("Temperature in Fahrenheit: " + convertedFahrenheit1);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheitToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsiusToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    // Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }
}
