
package Prueba2Libreria;

import java.util.ArrayList;

/**
 *
 * @author Julio Cifuentes
 * @version 10/10/2023
 */
public class Coleccion {
    
    ArrayList<Libro> listaLibro;

    public Coleccion() {
        
        listaLibro = new ArrayList<>();
    }
    
    public boolean agregarLibros(Libro libro){
        return listaLibro.add(libro);
    }
    
    public void listarLibros(){
        for (Libro libro : listaLibro) {
            libro.mostrarDatos();
            System.out.println("-------------------");
        }
    }
    
    public boolean validarLibroEnLista(String nombreLibro, String autorLibro){
        for (Libro libro : listaLibro) {
            if (libro.getTitulo().equalsIgnoreCase(nombreLibro) && libro.getAutor().equalsIgnoreCase(autorLibro)) {
                return false;
            }
        }
        return true;
    }
    
    public int totalCompraConIva(){
        int total = 0;
        for (Libro libro : listaLibro) {
            total = total + libro.calcularTotalConIva();
        }
        return total;
    }
    
    public int totalCompraConDescuento(){
        int total = 0;
        for (Libro libro : listaLibro) {
            total = total + libro.calcularDescuento();
        }
        return total;
    }
    
    public void categoriaLibros(){
        int cantInfantil = 0;        
        int cantDeporte = 0;
        for (Libro libro : listaLibro) {
            if (libro.getClass().getName().equalsIgnoreCase("Prueba2Libreria.Infantil")) {
                cantInfantil = cantInfantil + 1;
                System.out.println("Libros Infantiles: " + cantInfantil);
                libro.mostrarDatos();
                System.out.println("-----------------------");
            }
            if (libro.getClass().getName().equalsIgnoreCase("Prueba2Libreria.Deporte")) {
                cantDeporte = cantDeporte + 1;
                System.out.println("Libros Deportes: " + cantDeporte);
                libro.mostrarDatos();
                System.out.println("-----------------------");
            }
        }
        
    }
    
    public void contarLibrosPorClase(){
        int cantInfantil = 0;        
        int cantDeporte = 0;
        for (Libro libro : listaLibro) {
            if (true) {
                
            }
            
        }
    }
    
    
    
    
    
}
