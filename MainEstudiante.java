import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los datos del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int age = scanner.nextInt();

        System.out.print("Ingrese la calificación del estudiante: ");
        int score = scanner.nextInt();

        // Crear objeto Estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(name, age, score);

        // Mostrar los datos del estudiante
        System.out.println("Datos del estudiante:");
        System.out.println(estudiante);
    }
}