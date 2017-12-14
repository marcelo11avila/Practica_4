/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Direccion {
    private String ciudad;
    private String callePrin;
    private String calleSec;

    public Direccion(String ciudad, String callePrin, String calleSec) {
        this.ciudad = ciudad;
        this.callePrin = callePrin;
        this.calleSec = calleSec;
    }

    public Direccion() {
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
        return  ciudad + ", callePrin=" + callePrin + ", calleSec=" + calleSec;
    }
    
    
    
    
}
