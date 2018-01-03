/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Direccion;
import modelo.Parqueadero;
import modelo.Persona;
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         File archivo = new File("C:\\progra");
        
        File archivoParq = new File("C:\\progra\\archivoParqueadero.txt");
        File archivoDire = new File("C:\\progra\\archivoDireccion.txt");
        
        archivoParq.createNewFile();
        archivoDire.createNewFile();
        
        List<Direccion> d = new ArrayList<Direccion>();
        List<Parqueadero> p = new ArrayList<Parqueadero>();
        List<Ticket> ti = new ArrayList<Ticket>();
        List<Trabajador> t = new ArrayList<Trabajador>();
        

        List<Persona> due = new ArrayList<Persona>();
        GestionDato gD = new GestionDato(d,p,ti,t,due,archivoParq,archivoDire);

        VentanaPrincipal vP = new VentanaPrincipal(gD);

    }

}
