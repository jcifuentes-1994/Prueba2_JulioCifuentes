
package Prueba2Libreria;

/**
 *
 * @author Julio Cifuentes
 * @version 10/10/2023
 */
public class Infantil extends Libro{
    
    private int edadMin;
    private int edadMax;
    //private int edadMax;

    
    public Infantil() {
    }

    public Infantil(int edadMin, int edadMax, int codigo, String titulo, String autor, int precio, int cantidad) {
        super(codigo, titulo, autor, precio, cantidad);
        this.edadMin = edadMin;
        this.edadMax = edadMax;
    }

    public int getEdadMin() {
        return edadMin;
    }

    
    public void setEdad(int edad) {
        this.edadMin = edadMin;      
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    @Override
    public String toString() {
        return "Infantil{" + "edadMin=" + edadMin + ", edadMax=" + edadMax + '}' + " " + super.toString();
    }



    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Edad mínima: " + this.getEdadMin());
        System.out.println("Edad máxima: " + this.getEdadMax());
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
        totalConDescuento = (int) (totalConDescuento + this.calcularTotalConIva() -this.calcularTotalConIva()*IDescuento.DESCUENTO_INFANTIL);
        return totalConDescuento;
    }


    
    
    
}
