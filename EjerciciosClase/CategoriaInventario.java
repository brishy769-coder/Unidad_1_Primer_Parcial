package CLASES;
public class CategoriaInventario {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de productos en inventario: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        String categoria;

        if (cantidad < 10) {
            categoria = "Bajo";
        } else if (cantidad <= 50) {
            categoria = "Medio";
        } else {
            categoria = "Alto";
        }

        System.out.println("Categoría de inventario: " + categoria);
    }
}
