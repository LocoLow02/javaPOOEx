public class SecondsByDay {
    private int days;

    // Constructor
    public SecondsByDay(int days) {
        this.days = days;
    }

    // Método para calcular la cantidad de segundos en el número de días especificado
    public int calculateSeconds() {
        return days * 24 * 60 * 60;
    }

    // Getter y Setter para la cantidad de días
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return "SecondsByDay [days=" + days + "]";
    }
}