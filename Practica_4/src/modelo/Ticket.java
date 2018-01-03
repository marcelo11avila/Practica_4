/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Joel Vasquez
 */
public class Ticket {
    
    private int numTicket;
    private Parqueadero parqueadero;
    private Vehiculo vehiculo;

    public Ticket() {
    }

    public Ticket(int numTicket, Parqueadero parqueadero, Vehiculo vehiculo) {
        this.numTicket = numTicket;
        this.parqueadero = parqueadero;
        this.vehiculo = vehiculo;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return  numTicket + "|" + parqueadero + "|" + vehiculo + '}';
    }
    
    
    
    
}
