/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaDireccion;
import vista.VentanaPrincipal;

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

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.ventanaInicial.getItemMenuList().get(0))) {
            VentanaDireccion vD = new VentanaDireccion(this.ventanaInicial.getgD());
            vD.setVisible(true);
        }

        //  if(e.getSource().equals(this.ventanaInicial.getItemMenuList().get(1))){
        //    VentanaDepartamento vD = new VentanaDepartamento(this.ventanaInicial.getgD());
        //  vD.setVisible(true);
        //}
        // if(e.getSource().equals(this.ventanaInicial.getItemMenuList().get(2))){
        //   VentanaEmpleado vE = new VentanaEmpleado(this.ventanaInicial.getgD());
        // vE.setVisible(true);
    }

}
