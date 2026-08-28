import java.util.Scanner;
public class ClasificacionEdada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Cliente Joven");
        } else if (edad <= 64) {
            System.out.println("Cliente Adulto");
        } else {
            System.out.println("Cliente de la Tercera Edad");
        }
    }
}

    

