package CLASES;
import java.util.Scanner;

public class Cajero_Automatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 500;
        int opcion;

        do {
            System.out.println("\n----- CAJERO AUTOMÁTICO -----");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actualizado: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                    } else {
                        System.out.println("Depósito inválido.");
                    }

                    System.out.println("Saldo actualizado: $" + saldo);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro > 0 && retiro <= 500 && retiro <= saldo) {
                        saldo -= retiro;
                    } else {
                        System.out.println("Retiro inválido.");
                    }

                    System.out.println("Saldo actualizado: $" + saldo);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    System.out.println("Saldo actualizado: $" + saldo);
                    break;

                default:
                    System.out.println("Opción inválida.");
                    System.out.println("Saldo actualizado: $" + saldo);
            }
        } while (opcion != 4);

        sc.close();
    }
}