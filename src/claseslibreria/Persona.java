package claseslibreria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam112
 */
public class Persona {
    
    private String nombre, apellidos;
    
    public void nombre(){
        System.out.println(nombre);
    }
    
    public void apellidos(){
        System.out.println(apellidos);
    }
    
    public void nombreCompleto(){
        System.out.println(nombre + " " + apellidos);
    }
    
}
