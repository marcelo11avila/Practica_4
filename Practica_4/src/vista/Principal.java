/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import modelo.Direccion;
import modelo.Parqueadero;
import modelo.Ticket;
import modelo.Trabajador;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Direccion> d = new ArrayList<Direccion>();
        List<Parqueadero> p = new ArrayList<Parqueadero>();
        List<Ticket> ti = new ArrayList<Ticket>();
        List<Trabajador> t = new ArrayList<Trabajador>();
        GestionDato gD = new GestionDato(d, p, ti, t);
        VentanaPrincipal vP = new VentanaPrincipal(gD);

    }

}
