/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librosejercicio;

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private int numeropaginas;
    private int calificacion;
    private Autor autor;

        public Libro(String titulo, int numeropaginas, int calificacion, Autor autor) {
            this.titulo = titulo;
            this.numeropaginas = numeropaginas;
            this.calificacion = calificacion;
            this.autor = autor;
        }
    
    
    public String getTitulo(){
        return titulo;
    }
public void setTitulo(String titulo){
    this.titulo=titulo;
}
public int getcalificacion(){
    return calificacion;
}
public void setCalidficacion( int calificacion){
    this.calificacion=calificacion;
}
public Autor getAutor(){
    return autor;
}
public void setAutor(Autor autor){
    this.autor=autor;
}
}
