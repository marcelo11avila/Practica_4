/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Parqueadero {
    
    private String nombre;
    private Direccion direccion;
    private int capacidad;
    private Persona duenio;

    public Parqueadero(String nombre, Direccion direccion, int capacidad, Persona duenio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.duenio = duenio;
    }

    public Parqueadero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return  nombre + ", direccion=" + direccion + ", capacidad=" + capacidad + ", duenio=" + duenio.getNombre();
    }
    
    
    
    
    
    
    
    
    
    
}
