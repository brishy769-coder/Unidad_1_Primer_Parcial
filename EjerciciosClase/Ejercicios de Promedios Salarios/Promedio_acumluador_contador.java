package Semana16;
import java.util.Scanner;

public class Promedio_acumluador_contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;          
        double acumulador = 0;   
        int contador = 0;        
        
        System.out.println("Ingrese salarios de empleados (negativo para terminar):");

        // Ciclo controlado por evento (se repite hasta que se ingrese un negativo)
        do {
            System.out.print("Salario: ");
            salario = sc.nextDouble();

            if (salario >= 0) {   // Centinela: si es negativo, se detiene
                acumulador += salario; // Sumar al acumulador
                contador++;            // Contar empleado
            }

        } while (salario >= 0);   // Condición de salida: salario negativo

        // Mostrar resultados
        if (contador > 0) {
            double promedio = acumulador / contador;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Número de salarios ingresados: " + contador);
            System.out.println("Promedio de salarios: " + promedio);
        } else {
            System.out.println("No se ingresaron salarios válidos.");
        }

        sc.close();
    }
}
