/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Direccion;
import vista.VentanaDireccion;

/**
 *
 * @author Estudiante
 */
public class EventoDireccion implements ActionListener{
    private  VentanaDireccion ventanaDireccion;
    private GestionDato gD;

    public EventoDireccion(GestionDato gD, VentanaDireccion ventanaDireccion ) {
        this.ventanaDireccion = ventanaDireccion;
        this.gD = gD;
    }

    public VentanaDireccion getVentanaDireccion() {
        return ventanaDireccion;
    }

    public void setVentanaDireccion(VentanaDireccion ventanaDireccion) {
        this.ventanaDireccion = ventanaDireccion;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource().equals(this.ventanaDireccion.getBotonList().get(0))){
             try{
            String ciu=this.ventanaDireccion.getTxtList().get(0).getText();
            String calleP=this.ventanaDireccion.getTxtList().get(1).getText();
            String calleS=this.ventanaDireccion.getTxtList().get(2).getText();
            int cod=Integer.parseInt(this.ventanaDireccion.getTxtList().get(0).getText());
           
 
            Direccion direccion = new Direccion(cod,ciu,calleP,calleS);
                 
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
            this.gD.persistirDireccionList(this.gD.getDireccionList());
            this.gD.LeerDireccionList();
            Object[][] datoDireccion=this.ventanaDireccion.cargaDatosTabla(this.ventanaDireccion.getGestionDato().getDireccionList().size(),4);
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
    }
    
    
}
