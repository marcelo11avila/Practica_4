/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Estudiante
 */
@Entity
public class Direccion implements Serializable{
    @Id
    private int cod;
    private String ciudad;
    private String callePrin;
    private String calleSec;

    public Direccion(int cod, String ciudad, String callePrin, String calleSec) {
        this.cod = cod;
        this.ciudad = ciudad;
        this.callePrin = callePrin;
        this.calleSec = calleSec;
    }
    
    public Direccion(){
        
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCallePrin() {
        return callePrin;
    }

    public void setCallePrin(String callePrin) {
        this.callePrin = callePrin;
    }

    public String getCalleSec() {
        return calleSec;
    }

    public void setCalleSec(String calleSec) {
        this.calleSec = calleSec;
    }

    @Override
    public String toString() {
        return cod + " / " + ciudad + " / " + callePrin + " / " + calleSec;
    }

   
    
    
    
    
}
