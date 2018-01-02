/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaInicial;
import vista.VentanaTicket;
import vista.VentanaTrabajador;

/**
 *
 * @author Estudiante
 */
public class EventoVentanaInicial implements ActionListener{
    private VentanaInicial ventanaInicial;

    public EventoVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }

    public VentanaInicial getVentanaInicial() {
        return ventanaInicial;
    }

    public void setVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        /*
         if(ae.getSource().equals(this.ventanaInicial.getItemMenuList().get(1))){
            VentanaTicket vt = new VentanaTicket(this.ventanaInicial.getgD());
            vt.setVisible(true);
        }
        
        if(ae.getSource().equals(this.ventanaInicial.getItemMenuList().get(2))){
             VentanaTrabajador vA = new VentanaTrabajador(this.ventanaInicial.getgD());
            vA.setVisible(true);
        
    }
    */
}
}
