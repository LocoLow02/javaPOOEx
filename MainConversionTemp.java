import java.util.Scanner;

public class MainConversionTemp {
    public static void main(String[] args) {
        ConversionTemp th = new ConversionTemp((9 *  + 160) / 5);
        Scanner sca = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
       
        double celsius = sca.nextDouble();

        ConversionTemp temp = new ConversionTemp(celsius);
        double fahrenheit = temp.convertToFahrenheit();

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        
        th.getCelsius();
    }
}