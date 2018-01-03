/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Parqueadero;
import vista.VentanaDuenio;
import vista.VentanaParqueadero;

/**
 *
 * @author Estudiante
 */
public class EventoParqueadero implements ActionListener{
    private VentanaParqueadero ventanaParqueadero;
    private GestionDato gD;

    public EventoParqueadero( GestionDato gD , VentanaParqueadero ventanaParqueadero) {
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
             try{
            int cod=Integer.parseInt(this.ventanaParqueadero.getTxtList().get(2).getText());
            String n=this.ventanaParqueadero.getTxtList().get(0).getText();
            String d=this.ventanaParqueadero.getComboDireccion().getSelectedItem().toString();
            int c= Integer.parseInt(this.ventanaParqueadero.getTxtList().get(1).getText());
            String due=this.ventanaParqueadero.getComboDuenio().getSelectedItem().toString();
           
 
            Parqueadero parqueadero = new Parqueadero(cod,n,this.ventanaParqueadero.getGestionDato().buscarDireccion(d),c,this.ventanaParqueadero.getGestionDato().buscarDuenio(due));
              
            boolean retorno=false;
             for(Parqueadero p:this.getgD().getParqueaderoList()){
               if(n.equals(p.getNombre())==true){
                  retorno=true;
                  break;
                   }
               }
          
           
             if(retorno==true){
            
                throw new TestException("no debe ser repetido");
             }
             else{
            
            this.gD.addParqueadero(parqueadero);
            this.gD.persistirParqueaderoList(this.gD.getParqueaderoList());
            this.gD.LeerParqueaderoList();
                 
             }
 
           
            Object[][] datoParqueadero=this.ventanaParqueadero.cargaDatosTabla(this.ventanaParqueadero.getGestionDato().getParqueaderoList().size(),4);
            this.ventanaParqueadero.setDatos(datoParqueadero);
            this.ventanaParqueadero.getModeloTabla().setDataVector(this.ventanaParqueadero.getDatos(), this.ventanaParqueadero.getEncabezado());
            
             }
             catch(TestException te){
                 JOptionPane.showMessageDialog(ventanaParqueadero, "No ingresar Universidades Repetidas", "Error", JOptionPane.ERROR_MESSAGE);

            }
            
              
         }
        
        
       
         
         
          if (ae.getSource().equals(this.ventanaParqueadero.getBotonList().get(1))){
            this.ventanaParqueadero.getTxtList().get(0).setText("");
            this.ventanaParqueadero.getTxtList().get(1).setText("");
            this.ventanaParqueadero.getTxtList().get(2).setText("");
            this.ventanaParqueadero.getTxtList().get(3).setText("");
            this.ventanaParqueadero.getTxtList().get(4).setText("");
            
            
        }
          
        if (ae.getSource().equals(this.ventanaParqueadero.getBotonList().get(2))){
           VentanaDuenio vd=new VentanaDuenio(this.ventanaParqueadero.getGestionDato());
           vd.setVisible(true);  
        }
         
         if (ae.getSource().equals(this.ventanaParqueadero.getBotonList().get(3))){
             System.out.println("Actualiza");
             
             this.ventanaParqueadero.addcombo(); 
        }

    }
    
    
    
    }
 

