package CLASES;
public class ConversionTemperatura {
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double celsius = Double.parseDouble(System.console().readLine());
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }
}
