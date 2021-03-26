/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase14.modelo;

/**
 *
 * @author cdiaz
 */
public class Grupo {
    
    private String nombre;
    private Boolean estado;

    public Grupo(String nombre) {
        this(nombre, true);
    }

    public Grupo(String nombre, Boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
