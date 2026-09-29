package CLASES;
public class CalculoIVA {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(System.console().readLine());
        double iva = precio * 0.21;
        double precioFinal = precio + iva;

        System.out.println("IVA: " + iva);
        System.out.println("Precio final con IVA: " + precioFinal);
    }
}
