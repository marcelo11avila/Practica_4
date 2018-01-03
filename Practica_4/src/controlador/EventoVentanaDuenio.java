/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Persona;
import vista.VentanaDuenio;

/**
 *
 * @author EstebanRM
 */
public class EventoVentanaDuenio implements ActionListener{
    private GestionDato gD;
    private VentanaDuenio ventanaDuenio;

    public EventoVentanaDuenio(GestionDato gD, VentanaDuenio ventanaDuenio) {
        this.gD = gD;
        this.ventanaDuenio = ventanaDuenio;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public VentanaDuenio getVentanaDuenio() {
        return ventanaDuenio;
    }

    public void setVentanaDuenio(VentanaDuenio ventanaDuenio) {
        this.ventanaDuenio = ventanaDuenio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(this.ventanaDuenio.getBotonList().get(0))){
            try{ 
            String n=this.ventanaDuenio.getTxtList().get(0).getText();
            String a=this.ventanaDuenio.getTxtList().get(1).getText();
            String c=this.ventanaDuenio.getTxtList().get(2).getText();
                   
            
            Persona duenio = new Persona(n,a,c);
            
             boolean retorno=false;
             for(Persona due:this.getgD().getDuenioList()){
               if(c.equals(due.getCedula())==true){
                  retorno=true;
                  break;
                   }
               }
             
            if(retorno==true){
            
                throw new TestException("no debe ser repetido");
             }
             else{ 
            
            this.gD.addPersona(duenio);
            }
            }
            catch(TestException te){
               JOptionPane.showMessageDialog(ventanaDuenio, "No ingresar Rectores Repetidos", "Error", JOptionPane.ERROR_MESSAGE);

            }
 
        }
        if (e.getSource().equals(this.ventanaDuenio.getBotonList().get(1))){
            
            this.ventanaDuenio.getTxtList().get(0).setText("");
            this.ventanaDuenio.getTxtList().get(1).setText("");
            this.ventanaDuenio.getTxtList().get(2).setText("");
            this.ventanaDuenio.getTxtList().get(3).setText("");
            this.ventanaDuenio.getTxtList().get(4).setText("");
            
            
        } 
    }
    
    
}
