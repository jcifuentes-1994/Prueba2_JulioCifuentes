
package Prueba2Libreria;

/**
 *
 * @author Julio Cifuentes
 * @version 10/10/2023
 */
public abstract class Libro implements IDescuento{
    
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected int precio;
    protected int cantidad;

    public Libro() {
    }

    public Libro(int codigo, String titulo, String autor, int precio, int cantidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    public abstract void mostrarDatos();
    
    public int calcularTotalSinIva(){
        int total = 0;
        total = total + this.getPrecio()*this.getCantidad();
        return total;
    }
    
}
