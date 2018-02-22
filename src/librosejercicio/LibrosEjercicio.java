/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librosejercicio;
    import java.util.Scanner;
//import librosejercicio.Libro;

/**
 *
 * @author Estudiante
 */
public class LibrosEjercicio {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Nombre Autor");
        String nombre=leer.next();
        //Dependencia
        Autor autor=new Autor (nombre, "Marquez","12345");
        Libro uno=new Libro("Cien Años", 300,10,autor);
        
        uno.setAutor(autor);
        String autorLibro=uno.getAutor().getNombre();
        System.out.println(autorLibro+uno.getAutor().getApellido());
        
    }
    
    
}
