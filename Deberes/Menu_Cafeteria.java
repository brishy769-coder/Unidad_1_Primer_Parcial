import java.util.Scanner;

public class Menu_Cafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion, cantidad;
        double precio = 0, subtotal, descuento, total;
        String producto = "";

        // Menú
        System.out.println("===== MENÚ CAFETERÍA =====");
        System.out.println("1. Café - $2.00");
        System.out.println("2. Sándwich - $3.50");
        System.out.println("3. Jugo - $1.50");
        System.out.println("4. Pastel - $4.00");
        System.out.println("==========================");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                producto = "Café";
                precio = 2.00;
                break;
            case 2:
                producto = "Sándwich";
                precio = 3.50;
                break;
            case 3:
                producto = "Jugo";
                precio = 1.50;
                break;
            case 4:
                producto = "Pastel";
                precio = 4.00;
                break;
            default:
                System.out.println("Opción inválida.");
                return; // termina el programa
        }

        System.out.print("Ingrese la cantidad: ");
        cantidad = sc.nextInt();

        subtotal = precio * cantidad;

        if (subtotal >= 10) {
            descuento = subtotal * 0.10;
        } else {
            descuento = 0;
        }

        total = subtotal - descuento;

        System.out.println("\n===== FACTURA =====");
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}

