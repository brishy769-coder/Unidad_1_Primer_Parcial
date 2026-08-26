public class Cafeteria_Universidad {
    public static void main (String [] args){
        System.out.println("BIENVENIDO A LA CAFETERIA DE LA UNIVERSIDAD");
        System.out.println("Ingrese su nombre");
        string nombre = nexLine();
        System.out.println("Ingrese su edad");
        int edad = nextLIne();
        System.out.println("Ingrese su carrera");
        string carrera = nextLine();
        System.out.println("Ingrese el producto que desea comprar");
        string producto = nextLine();
        System.out.println("Ingrese el precio unitario del producto");
        double precio = nextDouble();
        System.out.println("Ingrese la cantidad que desea comprar");
        int cantidad = nextInt();
        System.out.println("Ingrese el dinero entregado");
        double dinero_entregado = nextDouble();

        //Calculos
        double total = precio * cantidad;
        double cambio = dinero_entregado - total;


    }
    
}
