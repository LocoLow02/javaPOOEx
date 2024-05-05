import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la longitud de los passwords
        System.out.print("Ingrese la longitud de los passwords: ");
        int longitud = scanner.nextInt();

        // Pedir al usuario el tamaño del array de Passwords
        System.out.print("Ingrese la cantidad de passwords a generar: ");
        int cantidadPasswords = scanner.nextInt();

        // Crear array de Passwords
        Password[] passwords = new Password[cantidadPasswords];
        boolean[] esFuerteArray = new boolean[cantidadPasswords];

        // Generar passwords y verificar si son fuertes
        for (int i = 0; i < cantidadPasswords; i++) {
            passwords[i] = new Password(longitud);
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        // Mostrar passwords y si son fuertes o no
        for (int i = 0; i < cantidadPasswords; i++) {
            System.out.println(passwords[i]);
        }
    }
}