import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radius = scanner.nextDouble();

        // Crear objeto Circle con el radio ingresado
        Circle circle = new Circle(radius);

        // Calcular y mostrar el área del círculo
        double area = circle.calculateArea();
        System.out.println("El área del círculo con radio " + radius + " es: " + area);
    }
}