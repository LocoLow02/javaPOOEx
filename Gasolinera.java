public class Gasolinera {
    private double precioLitro;
    private double galonesSurtidos;

    // Constructor default
    public Gasolinera() {
        this.precioLitro = 0.0;
        this.galonesSurtidos = 0.0;
    }

    // Setter para el precio por litro
    public void setPrecioLitro(double precioLitro) {
        this.precioLitro = precioLitro;
    }

    // Setter para la cantidad de galones surtidos
    public void setGalonesSurtidos(double galonesSurtidos) {
        this.galonesSurtidos = galonesSurtidos;
    }

    // Getter para el precio por litro
    public double getPrecioLitro() {
        return precioLitro;
    }

    // Getter para la cantidad de galones surtidos
    public double getGalonesSurtidos() {
        return galonesSurtidos;
    }

    // Método para calcular el total a cobrar al cliente
    public double calcularTotal() {
        return precioLitro * galonesSurtidos * 3.78541; // Conversión de galones a litros
    }

    // Método toString para representación de objetos en forma de cadena
    @Override
    public String toString() {
        return "Gasolinera [precioLitro=" + precioLitro + ", galonesSurtidos=" + galonesSurtidos + "]";
    }
}