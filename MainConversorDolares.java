import java.util.Scanner;

public class MainConversorDolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación del objeto y asignación del tipo de cambio
        System.out.print("Ingrese el tipo de cambio (pesos por dólar): ");
        double tipoCambio = scanner.nextDouble();
        ConversorDolares conversor = new ConversorDolares(tipoCambio);

        // Utilizando setters para cambiar el tipo de cambio si es necesario
        // conversor.setTipoCambio(20.5);

        // Se ingresa la cantidad de pesos
        System.out.print("Ingrese la cantidad de pesos a convertir: ");
        double pesos = scanner.nextDouble();

        // Se realiza la conversión y se imprime el resultado
        double dolares = conversor.convertir(pesos);
        System.out.println(pesos + " pesos equivalen a " + dolares + " dólares.");

        // Utilizando toString para imprimir el objeto conversor
        System.out.println(conversor);
    }
}