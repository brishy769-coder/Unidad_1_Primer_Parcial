package CLASES;
import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        double base, altura, area;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        base = entrada.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.printf("El área del rectángulo es: %.2f%n", area);
    }
}
