/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Ticket;
import vista.VentanaTicket;

/**
 *
 * @author Joel Vasquez
 */
public class EventoTicket implements ActionListener{

     private VentanaTicket ventanaTicket;
     private GestionDato gestionDato;

    public EventoTicket(VentanaTicket ventanaTicket, GestionDato gestionDato) {
        this.ventanaTicket = ventanaTicket;
        this.gestionDato = gestionDato;
    }

    public VentanaTicket getVentanaTicket() {
        return ventanaTicket;
    }

    public void setVentanaTicket(VentanaTicket ventanaTicket) {
        this.ventanaTicket = ventanaTicket;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }
    
     
     
     @Override
    public void actionPerformed(ActionEvent ae) {
          if(ae.getSource().equals(this.ventanaTicket.getBoton1())){
           
          String n= this.ventanaTicket.getTxtList().get(0).getText();
          String c= this.ventanaTicket.getCombo().getSelectedItem().toString();   
          String c1= this.ventanaTicket.getCombo1().getSelectedItem().toString(); 
          
           // Ticket ti = new Ticket(n, this.ventanaTicket.getgD().buscarParqueadero(c1));
           //this.gestionDato.addTicket(ti);
            
            Object[][] datoTicket = this.ventanaTicket.cargaDatosTabla(this.ventanaTicket.getgD().getTicketList().size(),3);
            this.ventanaTicket.setDatos(datoTicket);
            this.ventanaTicket.getModeloTabla().setDataVector(this.ventanaTicket.getDatos(), this.ventanaTicket.getEncabezado());
     
        }
        
        if(ae.getActionCommand().equals("Limpiar")){
            this.ventanaTicket.getTxtList().get(0).setText("");
            this.ventanaTicket.getTxtList().get(1).setText("");
            this.ventanaTicket.getTxtList().get(2).setText("");
            
        }
    }
        
    
}
