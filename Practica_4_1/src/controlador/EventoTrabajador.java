/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Direccion;
import modelo.Trabajador;
import vista.VentanaTrabajador;

/**
 *
 * @author Joel Vasquez
 */
public class EventoTrabajador implements ActionListener{
    private VentanaTrabajador ventanaTrabajador;
    private GestionDato gD;

    public EventoTrabajador(VentanaTrabajador ventanaTrabajador) {
        this.ventanaTrabajador = ventanaTrabajador;
    
    }

    
    public VentanaTrabajador getVentanaTrabajador() {
        return ventanaTrabajador;
    }

    public void setVentanaTrabajador(VentanaTrabajador ventanaTrabajador) {
        this.ventanaTrabajador = ventanaTrabajador;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            String nombre=this.ventanaTrabajador.getTxtList().get(0).getText();
            String apellido=this.ventanaTrabajador.getTxtList().get(1).getText();
            String cedula=this.ventanaTrabajador.getTxtList().get(2).getText();
            String parqueadero = this.ventanaTrabajador.getgD().cargarComboParqueadero().toString();
           
 
            Trabajador trabajador = new Trabajador(nombre, apellido, cedula, this.ventanaTrabajador.getgD().buscarParqueadero(parqueadero));
                 
            if(nombre.length()==0){
               throw new NullPointerException(); 
            }
             if(apellido.length()==0){
               throw new NullPointerException(); 
            }
              if(cedula.length()==0){
               throw new NullPointerException(); 
            }
 
            this.ventanaTrabajador.getgD().addTrabajador(trabajador);
            this.gD.persistirDireccionList(this.gD.getDireccionList());
            this.gD.LeerDireccionList();
            Object[][] datoDireccion=this.ventanaTrabajador.cargaDatosTabla(this.ventanaTrabajador.getgD().getDireccionList().size(),4);
            this.ventanaTrabajador.setDatos(datoDireccion);
            this.ventanaTrabajador.getModeloTabla().setDataVector(this.ventanaTrabajador.getDatos(), this.ventanaTrabajador.getEncabezado());
            
        }catch(Exception ex){
            
        }
        
        if (ae.getSource().equals(this.ventanaTrabajador.getBoton2())){
            this.ventanaTrabajador.getTxtList().get(0).setText("");
            this.ventanaTrabajador.getTxtList().get(1).setText("");
            this.ventanaTrabajador.getTxtList().get(2).setText("");
            this.ventanaTrabajador.getTxtList().get(3).setText("");
            
    }
    
    
}
}
