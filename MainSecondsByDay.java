import java.util.Scanner;

public class MainSecondsByDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de días
        System.out.print("Ingrese la cantidad de días: ");
        int days = scanner.nextInt();

        // Crear objeto SecondsByDay con la cantidad de días ingresada
        SecondsByDay secondsByDay = new SecondsByDay(days);

        // Calcular y mostrar la cantidad de segundos
        int seconds = secondsByDay.calculateSeconds();
        System.out.println("La cantidad de segundos en " + days + " días es: " + seconds);
    }
}