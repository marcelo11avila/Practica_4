/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaDireccion;
import vista.VentanaParqueadero;
import vista.VentanaPrincipal;
import vista.VentanaTicket;
import vista.VentanaTrabajador;
import vista.VentanaVehiculo;

/**
 *
 * @author Estudiante
 */
public class EventoVentanaInicial implements ActionListener {

    private VentanaPrincipal ventanaInicial;

    public EventoVentanaInicial(VentanaPrincipal ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }

    public VentanaPrincipal getVentanaInicial() {
        return ventanaInicial;
    }

    public void setVentanaInicial(VentanaPrincipal ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.ventanaInicial.getItemMenuList().get(0))) {
            VentanaDireccion vD = new VentanaDireccion(this.ventanaInicial.getgD());
            vD.setVisible(true);
        }
        if (e.getSource().equals(this.ventanaInicial.getItemMenuList().get(1))) {
            VentanaParqueadero vP = new VentanaParqueadero(this.ventanaInicial.getgD());
            vP.setVisible(true);
        }
        if (e.getSource().equals(this.ventanaInicial.getItemMenuList().get(2))) {
            VentanaVehiculo vV = new VentanaVehiculo(this.ventanaInicial.getgD());
            vV.setVisible(true);
        }
          if (e.getSource().equals(this.ventanaInicial.getItemMenuList().get(3))) {
            VentanaTicket vT = new VentanaTicket(this.ventanaInicial.getgD());
            vT.setVisible(true);
        }
          if (e.getSource().equals(this.ventanaInicial.getItemMenuList().get(4))) {
            VentanaTrabajador vT2 = new VentanaTrabajador(this.ventanaInicial.getgD());
            vT2.setVisible(true);
        }
        

        
    }
}
