/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase14.ui;

import co.edu.utp.isc.progiv.p4.clase14.modelo.Persona;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cdiaz
 */
public class LibretaTableModel extends DefaultTableModel {

    private final String[] columnas = {"Identificacion", "Nombre", "Grupo", "Estado"};
    private List<Persona> datos;

    public LibretaTableModel(List<Persona> datos) {
        this.datos = datos;
        super.setColumnIdentifiers(columnas);
    }

    public void setDatos(List<Persona> datos) {
        this.datos = datos;
        actualizarDatos();
    }

    public void actualizarDatos() {
        fireTableDataChanged();
    }

    public Persona getDato(int row) {
        return datos.get(row);
    }

    @Override
    public int getRowCount() {
        return datos == null ? 0 : datos.size();
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Persona persona = datos.get(row);
        switch (column) {
            case 0: // Identificacion
                return persona.getIdentificacion();
            case 1: // Nombre
                return persona.getNombre();
            case 2: // Grupo
                return persona.getGrupo().getNombre();
            case 3: // Estado
                return persona.getEstado();
        }
        return super.getValueAt(row, column);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0: // Identificacion
                return Long.class;
            case 1: // Nombre
            case 2: // Grupo
                return String.class;
            case 3: // Estado
                return Boolean.class;
        }
        return super.getColumnClass(column);
    }
    
    

}
