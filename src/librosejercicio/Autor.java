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
public class Autor {
    private String nombre;
    private String apellido;
    private String telefono;

    public Autor(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
}
    
    public void setApellido(String apellido){
    this.apellido=apellido;
}
    
    public void setTelefono(String telefono){
    this.telefono=telefono;
}
}
