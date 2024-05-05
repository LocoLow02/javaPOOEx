public class ConversorDolares {
    private double tipoCambio;

    // Constructor
    public ConversorDolares(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    // Getter para el tipo de cambio
    public double getTipoCambio() {
        return tipoCambio;
    }

    // Setter para el tipo de cambio
    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    // Método para convertir pesos a dólares
    public double convertir(double pesos) {
        return pesos / tipoCambio;
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return "ConversorDolares [tipoCambio=" + tipoCambio + "]";
    }
}