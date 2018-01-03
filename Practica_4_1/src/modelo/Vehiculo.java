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
public class Vehiculo {
     private String marca;
     private String modelo;
     private String placa;
     private Persona duenio;

    public Vehiculo(String marca, String modelo, String placa, Persona duenio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.duenio = duenio;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", duenio=" + duenio + '}';
    }
     
    
}
