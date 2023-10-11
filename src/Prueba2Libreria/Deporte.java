
package Prueba2Libreria;

/**
 *
 * @author Julio Cifuentes
 * @version 10/10/2023
 */
public class Deporte extends Libro{
    
    private String descripcionDeporte;

    public Deporte() {
    }

    public Deporte(String descripcionDeporte, int codigo, String titulo, String autor, int precio, int cantidad) {
        super(codigo, titulo, autor, precio, cantidad);
        this.descripcionDeporte = descripcionDeporte;
    }

    public String getDescripcionDeporte() {
        return descripcionDeporte;
    }

    public void setDescripcionDeporte(String descripcionDeporte) {
        this.descripcionDeporte = descripcionDeporte;
    }

    @Override
    public String toString() {
        return "Deporte{" + "descripcionDeporte=" + descripcionDeporte + '}' + " " + super.toString();
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descripción Deporte: " + this.getDescripcionDeporte());
    }    
    
    @Override
    public int calcularTotalConIva() {
        int totalConIva = 0;
        totalConIva = (int) (totalConIva + super.calcularTotalSinIva() + super.calcularTotalSinIva()*IDescuento.IVA);
        return totalConIva;
    }

    @Override
    public int calcularDescuento() {
        int totalConDescuento = 0;
        totalConDescuento = (int) (totalConDescuento + this.calcularTotalConIva() - this.calcularTotalConIva()*IDescuento.DESCUENTO_DEPORTE);
        return totalConDescuento;
    }
    
}
