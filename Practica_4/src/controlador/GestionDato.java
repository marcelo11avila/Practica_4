/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Direccion;
import modelo.Parqueadero;
import modelo.Persona;
import modelo.Ticket;
import modelo.Trabajador;
import modelo.Vehiculo;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private List<Direccion> DireccionList;
    private List<Parqueadero> ParqueaderoList;
    private List<Ticket>TicketList;
    private List<Trabajador>TrabajadorList;
    private List<Persona> DuenioList;
    private List<Vehiculo> vehiculoList;
    private File datosDireccion;
    private File datosParqueadero;

    public GestionDato(List<Vehiculo> VehiculoList,List<Direccion> DireccionList, List<Parqueadero> ParqueaderoList, List<Ticket> TicketList, List<Trabajador> TrabajadorList, List<Persona> DuenioList, File datosDireccion, File datosParqueadero) {
        this.DireccionList = DireccionList;
        this.ParqueaderoList = ParqueaderoList;
        this.TicketList = TicketList;
        this.TrabajadorList = TrabajadorList;
        this.DuenioList = DuenioList;
        this.vehiculoList = VehiculoList;
        this.datosDireccion = datosDireccion;
        this.datosParqueadero = datosParqueadero;
    }

    public File getDatosDireccion() {
        return datosDireccion;
    }

    public void setDatosDireccion(File datosDireccion) {
        this.datosDireccion = datosDireccion;
    }

    

    public File getDatosParqueadero() {
        return datosParqueadero;
    }

    public void setDatosParqueadero(File datosParqueadero) {
        this.datosParqueadero = datosParqueadero;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    

    

    public List<Direccion> getDireccionList() {
        return DireccionList;
    }

    public void setDireccionList(List<Direccion> DireccionList) {
        this.DireccionList = DireccionList;
    }

    public List<Parqueadero> getParqueaderoList() {
        return ParqueaderoList;
    }

    public void setParqueaderoList(List<Parqueadero> ParqueaderoList) {
        this.ParqueaderoList = ParqueaderoList;
    }

    public List<Ticket> getTicketList() {
        return TicketList;
    }

    public void setTicketList(List<Ticket> TicketList) {
        this.TicketList = TicketList;
    }

    public List<Trabajador> getTrabajadorList() {
        return TrabajadorList;
    }

    public void setTrabajadorList(List<Trabajador> TrabajadorList) {
        this.TrabajadorList = TrabajadorList;
    }

    public List<Persona> getDuenioList() {
        return DuenioList;
    }

    public void setDuenioList(List<Persona> DuenioList) {
        this.DuenioList = DuenioList;
    }

    
     public boolean addDireccion(Direccion direccion) {
        
	return this.DireccionList.add(direccion);
    }
      public boolean addVehiculo(Vehiculo vehiculo) {
        
	return this.vehiculoList.add(vehiculo);
    }
    public boolean addParqueadero(Parqueadero parqueadero) {
        
	return this.ParqueaderoList.add(parqueadero);
    }
    
     public boolean addTicket(Ticket ticket) {
        
	return this.TicketList.add(ticket);
    }
     
      public boolean addTrabajador(Trabajador  trabajador) {
        
	return this.TrabajadorList.add(trabajador);
    }
    
       public boolean addPersona(Persona  duenio) {
        
	return this.DuenioList.add(duenio);
    }
    
       
       
    public Direccion buscarDireccion(String x) {
		Direccion retorno= null;
		for(Direccion d: this.DireccionList)
		{
			if(d.getCiudad()==x) {
				retorno=d;
			}
		}
		return retorno;
	}

   public Parqueadero buscarParqueadero(String x) {
		Parqueadero retorno= null;
		for(Parqueadero p: this.ParqueaderoList)
		{
			if(p.getNombre()==x) {
				retorno=p;
			}
		}
		return retorno;
	}
    public Persona buscarDuenio(String x) {
		Persona retorno= null;
		for(Persona due: this.DuenioList)
		{
			if(due.getCedula()==x) {
				retorno=due;
			}
		}
		return retorno;
	}
    
     
    public boolean persistirParqueaderoList(List<Parqueadero> lista){
        try{
            FileWriter ae = new FileWriter(datosParqueadero.getAbsolutePath(),true);
            BufferedWriter escritura = new BufferedWriter(ae);
            for(Parqueadero p:lista ){
            escritura.append(p.toString());
            escritura.newLine();
        }
           
            escritura.close();
           return true;     
        }
        catch(IOException e){
            return false;
        }
    }
    
    public boolean persistirDireccionList(List<Direccion> lista){
        try{
            FileWriter ae = new FileWriter(datosDireccion.getAbsolutePath(),true);
            BufferedWriter escritura = new BufferedWriter(ae);
            for(Direccion d:lista ){
            escritura.append(d.toString());
            escritura.newLine();
        }
           
            escritura.close();
           return true;     
        }
        catch(IOException e){
            return false;
        }
    }
    
    
     public Parqueadero dividido(String linea){
        String[] lineaArray= linea.split(" / ");
        Parqueadero p = new Parqueadero(Integer.parseInt(lineaArray[1]),lineaArray[2],this.buscarDireccion(lineaArray[2]), Integer.parseInt(lineaArray[2]),this.buscarDuenio(lineaArray[1]));
        return p;
    }
     public List<Parqueadero> LeerParqueaderoList(){
        try{
            List<Parqueadero> p= new ArrayList<Parqueadero>();
            FileReader ae = new FileReader(datosParqueadero.getAbsolutePath());
            BufferedReader lectura = new BufferedReader(ae); 
            String linea;
            
            
            while((linea=lectura.readLine())!=null){
                
                p.add(this.dividido(linea));
   
            }
             
            lectura.close();
                
            return p;
            
                
        }
        catch(IOException e){
            return null;
        }
    }
     
    public Direccion dividido2(String linea){
        String[] lineaArray= linea.split(" / ");
        System.out.println(lineaArray[0]);
        Direccion d = new Direccion(Integer.parseInt(lineaArray[0]),lineaArray[1],lineaArray[2],lineaArray[3]);
        return d;
    }
     public List<Direccion> LeerDireccionList(){
        try{
            List<Direccion> d= new ArrayList<Direccion>();
            FileReader ae = new FileReader(datosDireccion.getAbsolutePath());
            BufferedReader lectura = new BufferedReader(ae); 
            String linea;
            
            
            while((linea=lectura.readLine())!=null){
                
                d.add(this.dividido2(linea));
   
            }
             
            lectura.close();
                
            return d;
            
                
        }
        catch(IOException e){
            return null;
        }
    }
     
    // public Object[] comboBoxRector() {
	//	Object[] combo = new Object[this.getPersonaList().size()];
	//	int i = 0;
	//	for (Rector r : this.getRectorList()) {
	//		combo[i] = r.getNombre() + " " + r.getApellido();
	//		i++;
	//	}
	//	return combo;
	//}
   
   
}
