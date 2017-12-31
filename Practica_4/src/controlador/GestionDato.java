/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Direccion;
import modelo.Parqueadero;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private List<Direccion> DireccionList;
    private List<Parqueadero> ParqueaderoList;

    public GestionDato(List<Direccion> DireccionList, List<Parqueadero> ParqueaderoList) {
        this.DireccionList = DireccionList;
        this.ParqueaderoList = ParqueaderoList;
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
    
     public boolean addDireccion(Direccion direccion) {
        
	return this.DireccionList.add(direccion);
    }
    public boolean addParqueadero(Parqueadero parqueadero) {
        
	return this.ParqueaderoList.add(parqueadero);
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
   
   
}
