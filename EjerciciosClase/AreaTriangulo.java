package CLASES;
public class AreaTriangulo {
    public static void main(String[] args) {
       System.out.println("Ingrese la base del triángulo: ");
       double base = Double.parseDouble(System.console().readLine());
       System.out.println("Ingrese la altura del triángulo: ");
       double altura = Double.parseDouble(System.console().readLine());
       double area = (base * altura) / 2;

       System.out.println("Área del triángulo: " + area);
    }
}
