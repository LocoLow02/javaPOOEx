public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Método para calcular el área del círculo
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Getter y Setter para el radio
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}