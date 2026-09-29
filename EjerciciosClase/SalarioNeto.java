package CLASES;
public class SalarioNeto {
    public static void main(String[] args) {
        System.out.println("Ingrese el salario bruto: ");
        double salarioBruto = Double.parseDouble(System.console().readLine());
        double deducciones = salarioBruto * 0.15; // 15% de deducciones
        double salarioNeto = salarioBruto - deducciones;

        System.out.println("Deducciones: " + deducciones);
        System.out.println("Salario neto: " + salarioNeto);
    }

}
