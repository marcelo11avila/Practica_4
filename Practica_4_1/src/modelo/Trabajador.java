/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Joel Vasquez
 */
@Entity
public class Trabajador  implements Serializable{
    @Id
    private String nombre;
    private String apellido;
    private String cedula;
    private Parqueadero parqueadero;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String cedula, Parqueadero parqueadero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.parqueadero = parqueadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    @Override
    public String toString() {
        return   nombre + "|" + apellido + "|" + cedula + "|" + parqueadero + '}';
    }
    
    

    }
    
    
   
    
    
    
    
    
    

