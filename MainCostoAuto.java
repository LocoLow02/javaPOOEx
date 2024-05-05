import java.util.Scanner;

public class MainCostoAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el costo del automóvil
        System.out.print("Ingrese el costo del automóvil: ");
        double costo = scanner.nextDouble();

        // Crear objeto CostoAuto con el costo ingresado
        CostoAuto auto = new CostoAuto(costo);

        // Calcular y mostrar el costo final para el consumidor
        double costoFinal = auto.calcularCostoFinal();
        System.out.println("El costo final para el consumidor es: $" + costoFinal);
    }
}