import java.util.Scanner;

public class MainGasolinera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación del objeto gasolinera
        Gasolinera gasolinera = new Gasolinera();

        // Captura del precio por litro
        System.out.print("Ingrese el precio por litro de gasolina: ");
        double precioLitro = scanner.nextDouble();
        gasolinera.setPrecioLitro(precioLitro);

        // Captura de la cantidad de galones surtidos
        System.out.print("Ingrese la cantidad de galones surtidos: ");
        double galonesSurtidos = scanner.nextDouble();
        gasolinera.setGalonesSurtidos(galonesSurtidos);

        // Cálculo del total a cobrar al cliente
        double total = gasolinera.calcularTotal();
        System.out.println("Total a cobrar al cliente: $" + total);

        // Imprimir objeto gasolinera
        System.out.println(gasolinera);
    }
}