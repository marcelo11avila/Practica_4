/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaParqueadero;

/**
 *
 * @author Estudiante
 */
public class EventoParqueadero implements ActionListener{
    private VentanaParqueadero ventanaParqueadero;
    private GestionDato gD;

    public EventoParqueadero(VentanaParqueadero ventanaParqueadero, GestionDato gD) {
        this.ventanaParqueadero = ventanaParqueadero;
        this.gD = gD;
    }

    public VentanaParqueadero getVentanaParqueadero() {
        return ventanaParqueadero;
    }

    public void setVentanaParqueadero(VentanaParqueadero ventanaParqueadero) {
        this.ventanaParqueadero = ventanaParqueadero;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource().equals(this.ventanaParqueadero.getBotonList().get(0))){
            // try{
            String n=this.ventanaParqueadero.getTxtList().get(0).getText();
            String d=this.ventanaParqueadero.getTxtList().get(1).getText();
            int c= Integer.parseInt(this.ventanaParqueadero.getTxtList().get(2).getText());
            String due=this.ventanaParqueadero.getTxtList().get(3).getText();
           /*
 
            //Parqueadero parqueadero = new Parqueadero(ciu,calleP,calleS);
                 
            if(ciu.length()==0){
               throw new NullPointerException(); 
            }
             if(calleP.length()==0){
               throw new NullPointerException(); 
            }
              if(calleS.length()==0){
               throw new NullPointerException(); 
            }
 
            this.ventanaDireccion.getGestionDato().addDireccion(direccion);
           
            Object[][] datoDireccion=this.ventanaDireccion.cargaDatosTabla(this.ventanaDireccion.getGestionDato().getDireccionList().size(),3);
            this.ventanaDireccion.setDatos(datoDireccion);
            this.ventanaDireccion.getModeloTabla().setDataVector(this.ventanaDireccion.getDatos(), this.ventanaDireccion.getEncabezado());
            
             }        
            catch(java.lang.NullPointerException npe){
                JOptionPane.showMessageDialog(ventanaDireccion, "Ingrese los datos en todas las casillas", "Error", JOptionPane.ERROR_MESSAGE);
            }
              
         }
        
        
       
         
         
          if (ae.getSource().equals(this.ventanaDireccion.getBotonList().get(1))){
            this.ventanaDireccion.getTxtList().get(0).setText("");
            this.ventanaDireccion.getTxtList().get(1).setText("");
            this.ventanaDireccion.getTxtList().get(2).setText("");
            this.ventanaDireccion.getTxtList().get(3).setText("");
            this.ventanaDireccion.getTxtList().get(4).setText("");
            
            
        }
*/
    }
    
    
    
    }
} 

