public class CostoAuto {
    private double costo;
    private double porcentajeGanancia;
    private double impuestos;

    // Constructor
    public CostoAuto(double costo) {
        this.costo = costo;
        this.porcentajeGanancia = 0.12; // 12%
        this.impuestos = 0.06; // 6%
    }

    // Método para calcular el costo final para el consumidor
    public double calcularCostoFinal() {
        return costo * (1 + porcentajeGanancia + impuestos);
    }

    // Getters y setters
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return "CostoAuto [costo=" + costo + ", porcentajeGanancia=" + porcentajeGanancia + ", impuestos=" + impuestos
                + "]";
    }
}