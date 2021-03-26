/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase14.modelo;

import java.util.Objects;

/**
 *
 * @author cdiaz
 */
public class Persona {
    
    private Long identificacion;
    private Grupo grupo;
    private String nombre;
    private String direccion;
    private Boolean estado;

    public Persona(Long identificacion, Grupo grupo, String nombre, Boolean estado) {
        this(identificacion, grupo, nombre, null, estado);
    }
    
    public Persona(Long identificacion, Grupo grupo, String nombre, String direccion, Boolean estado) {
        this.identificacion = identificacion;
        this.grupo = grupo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.identificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.identificacion, other.identificacion)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
