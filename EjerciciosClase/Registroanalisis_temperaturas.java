package CLASES;
import java.util.Scanner;

public class Registroanalisis_temperaturas  {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int temp;
        int suma = 0, cont = 0;
        int frio = 0, templado = 0, calido = 0, muyCalido = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Ingrese temperaturas (999 para terminar):");
        temp = teclado.nextInt();

        while (temp != 999) {
            if (temp >= -50 && temp <= 60) {
                cont++;
                suma += temp;

                if (temp > mayor) mayor = temp;
                if (temp < menor) menor = temp;

                if (temp < 10) {
                    frio++;
                } else if (temp <= 24) {
                    templado++;
                } else if (temp <= 34) {
                    calido++;
                } else {
                    muyCalido++;
                }
            } else {
                System.out.println("Dato inválido: " + temp);
            }

            temp = teclado.nextInt();
        }

        if (cont > 0) {
            double promedio = (double) suma / cont;
            System.out.println("Cantidad de datos válidos: " + cont);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.println("Promedio: " + promedio);
            System.out.println("Fríos: " + frio);
            System.out.println("Templados: " + templado);
            System.out.println("Cálidos: " + calido);
            System.out.println("Muy cálidos: " + muyCalido);
        } else {
            System.out.println("No se ingresaron datos válidos.");
        }

        teclado.close();
    }
}
