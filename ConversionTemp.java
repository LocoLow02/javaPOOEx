public class ConversionTemp {
    private double celsius;

    // Constructor
    public ConversionTemp(double celsius) {
        this.celsius = celsius;
    }

    // Método para convertir Celsius a Fahrenheit
    public double convertToFahrenheit() {
        return (9 * celsius + 160) / 5;
    }

    // Getter y Setter para Celsius
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public String toString() {
        return "ConversionTemp [celsius=" + celsius + "]";
    }
}