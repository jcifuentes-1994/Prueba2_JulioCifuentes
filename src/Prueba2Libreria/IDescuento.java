
package Prueba2Libreria;

/**
 *
 * @author Julio Cifuentes
 * @version 10/10/2023
 */
public interface IDescuento {
    
    double IVA = 0.19;
    double DESCUENTO_INFANTIL = 0.05;
    double DESCUENTO_DEPORTE = 0.1;
    
    public abstract int calcularTotalConIva();
    
    public abstract int calcularDescuento();
    
}
