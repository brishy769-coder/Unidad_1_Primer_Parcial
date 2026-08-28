import java.util.Scanner;

public class ProgramaCafetria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, universidad, producto;
        int edad, cantidad;
        double precio, dinero, subtotal, descuento, total, cambio;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese su universidad: ");
        universidad = sc.nextLine();

        System.out.print("Ingrese el producto: ");
        producto = sc.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        precio = sc.nextDouble();

        System.out.print("Ingrese la cantidad de unidades: ");
        cantidad = sc.nextInt();

        System.out.print("Ingrese el dinero entregado: ");
        dinero = sc.nextDouble();

        subtotal = precio * cantidad;
        descuento = subtotal * 0.10;
        total = subtotal - descuento;

        // Bloque de datos personales
        System.out.println("\n=== DATOS PERSONALES ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Universidad: " + universidad);

        // Bloque de datos de compra
        System.out.println("\n=== DATOS DE COMPRA ===");
        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento (10%): " + descuento);
        System.out.println("Total a pagar: " + total);

        if (dinero >= total) {
            cambio = dinero - total;
            System.out.println("Dinero entregado: " + dinero);
            System.out.println("Cambio: " + cambio);
            System.out.println("Compra exitosa");
        } else {
            System.out.println("Dinero entregado: " + dinero);
            System.out.println("Dinero insuficiente para cubrir el pago.");
        }

        sc.close();
    }
}