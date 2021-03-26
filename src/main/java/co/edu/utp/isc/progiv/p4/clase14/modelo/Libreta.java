/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase14.modelo;

import co.edu.utp.isc.progiv.p4.clase14.excepciones.FormatoErroneoException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cdiaz
 */
public class Libreta {
    
    private final List<Persona> personas;
    private final List<Grupo> grupos;

    public Libreta() {
        personas = new ArrayList<>();
        grupos = new ArrayList<>();
        inicializarGrupos();
    }

    public List<Persona> getPersonas() {
        return personas;
    }
    
    public void agregarPersona(Persona persona) throws FormatoErroneoException {
        int pos = personas.indexOf(persona);
        if(pos != -1){
            personas.set(pos, persona);
        } else {
            personas.add(persona);
        }
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    private void inicializarGrupos() {
        grupos.add(new Grupo("Familia"));
        grupos.add(new Grupo("Amigos"));
        grupos.add(new Grupo("Estudio"));
        grupos.add(new Grupo("Trabajo"));
        grupos.add(new Grupo("Otros"));
    }

    public void eliminarPersona(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
