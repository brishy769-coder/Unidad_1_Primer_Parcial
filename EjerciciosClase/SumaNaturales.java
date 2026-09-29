package CLASES;
public class SumaNaturales {
    public static void main(String[] args) {
        int n = 10; // Número hasta el cual se desea sumar
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }
}
