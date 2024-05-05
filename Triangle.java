public class Triangle {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Método para calcular el área del triángulo
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Getter y Setter para la base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Getter y Setter para la altura
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}