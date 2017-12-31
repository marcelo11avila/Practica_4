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
        GestionDato gD = new GestionDato(d,p);
        VentanaPrincipal vP = new VentanaPrincipal(gD);
    }
    
}
