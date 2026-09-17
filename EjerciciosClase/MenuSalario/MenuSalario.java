
    import java.util.Scanner;

public class MenuSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        int contador = 0;
        double acumulador = 0;
        double salarioMayor = 0;
        double salarioMenor = 0;

        do {

            System.out.println("\n===== SISTEMA DE SALARIOS =====");
            System.out.println("1. Registrar salarios");
            System.out.println("2. Mostrar resumen");
            System.out.println("3. Comparar un salario con el promedio");
            System.out.println("4. Reiniciar información");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.println("\n--- REGISTRO DE SALARIOS ---");
                    System.out.println("Ingrese salarios. Para terminar, ingrese un salario negativo.");

                    double salario;

                    System.out.print("Ingrese salario: ");
                    salario = sc.nextDouble();

                    while (salario >= 0) {

                        // Contador
                        contador++;

                        // Acumulador
                        acumulador = acumulador + salario;

                        // Determinar mayor y menor
                        if (contador == 1) {
                            salarioMayor = salario;
                            salarioMenor = salario;
                        } else {

                            if (salario > salarioMayor) {
                                salarioMayor = salario;
                            }

                            if (salario < salarioMenor) {
                                salarioMenor = salario;
                            }
                        }

                        System.out.print("Ingrese salario: ");
                        salario = sc.nextDouble();
                    }

                    System.out.println("Registro terminado.");
                }

                case 2 -> {
                    System.out.println("\n--- RESUMEN DE SALARIOS ---");

                    if (contador == 0) {
                        System.out.println("No existen salarios registrados.");
                    } else {

                        double promedio = acumulador / contador;

                        System.out.println("Cantidad de salarios: " + contador);
                        System.out.println("Total de salarios: $" + acumulador);
                        System.out.println("Promedio: $" + promedio);
                        System.out.println("Salario mayor: $" + salarioMayor);
                        System.out.println("Salario menor: $" + salarioMenor);
                    }
                }

                case 3 -> {
                    System.out.println("\n--- COMPARAR SALARIO CON EL PROMEDIO ---");

                    if (contador == 0) {

                        System.out.println("No existen salarios registrados.");
                        System.out.println("Primero debe registrar salarios.");

                    } else {

                        double promedio = acumulador / contador;

                        System.out.print("Ingrese el salario que desea comparar: ");
                        double salarioComparar = sc.nextDouble();

                        if (salarioComparar > promedio) {
                            System.out.println("El salario está por encima del promedio.");
                        } else if (salarioComparar < promedio) {
                            System.out.println("El salario está por debajo del promedio.");
                        } else {
                            System.out.println("El salario es igual al promedio.");
                        }
                    }
                }

                case 4 -> {
                    contador = 0;
                    acumulador = 0;
                    salarioMayor = 0;
                    salarioMenor = 0;

                    System.out.println("\nInformación reiniciada correctamente.");
                }

                case 0 -> System.out.println("\nSaliendo del sistema...");

                default -> System.out.println("\nOpción no válida.");

            }

        } while (opcion != 0);

        sc.close();
    }
}


