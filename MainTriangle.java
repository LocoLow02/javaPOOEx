import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        // Solicitar al usuario la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        double height = scanner.nextDouble();

        // Crear objeto Triangle con la base y la altura ingresadas
        Triangle triangle = new Triangle(base, height);

        // Calcular y mostrar el área del triángulo
        double area = triangle.calculateArea();
        System.out.println("El área del triángulo con base " + base + " y altura " + height + " es: " + area);
    }
}