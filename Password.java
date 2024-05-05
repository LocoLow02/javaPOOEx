import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    // Constructor por defecto
    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    // Constructor con longitud personalizada
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Método para comprobar si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    // Método para generar una contraseña aleatoria
    public void generarPassword() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(longitud);
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < longitud; i++) {
            int index = rnd.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        contraseña = sb.toString();
    }

    // Getters y setters
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return contraseña + " " + esFuerte();
    }
}