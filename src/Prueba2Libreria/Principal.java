
package Prueba2Libreria;

/**
 *
 * @author Julio Cifuentes
 * @version 10/10/2023
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Coleccion col = new Coleccion();
        
        Infantil infantil = new Infantil(7, 8, 1, "Una Familia Anormal", "LYNA VALLEJOS", 10000, 1);
        Deporte deporte = new Deporte("Ciclismo", 2, "Manual de la Bicicleta", "CHRIS SIDWELLS", 23990, 1);
        
        
        //agregar libros a la lista
        col.agregarLibros(infantil);
        col.agregarLibros(deporte);
        
        
        //mostrar los libros en la lista
        System.out.println("Lista de libros: ");
        col.listarLibros();
        System.out.println("****************");
        
        //validar si libro existe
        String nombreLibro = "Manual de la Bicicleta";
        String autorLibro = "CHRIS SIDWELLS";       
                
        boolean flag = col.validarLibroEnLista(nombreLibro, autorLibro);
        
        if (flag == true) {
            col.agregarLibros(deporte);            
        }else{
            System.out.println("El libro ya existe");
        }
        System.out.println("****************");
        
        //mostrar si se agregó o no el libro
        col.listarLibros();
       
        
        // boleta de la compra
        System.out.println("***** BOLETA *****");
        col.listarLibros();
        System.out.println("----------------------");
        System.out.println("Total con IVA: $" + col.totalCompraConIva());
        
        System.out.println("Total con Descuento: $" + col.totalCompraConDescuento());
        System.out.println("**************");
        
        //mostrar categoría de libros y su cantidad
        System.out.println("Categoría de libros: ");
        col.categoriaLibros();
        
    }
    
}
