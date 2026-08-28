import java.util.Scanner;

public class Numeromayora100 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero > 100) {
            System.out.println("El número es mayor a 100");
        } else {
            System.out.println("El número es menor o igual a 100");
        }
    }
}
