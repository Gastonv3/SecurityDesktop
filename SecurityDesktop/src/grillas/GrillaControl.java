/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grillas;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import objetos.Control;
import objetos.Usuario;
import util.fecha;

/**
 *
 * @author Skylake
 */
public class GrillaControl extends AbstractTableModel{
   
    private ArrayList<Control> ac;
    private String titulos[] = {"NOMBRE", "APELLIDO", "LUGAR", "LATITUD", 
        "LONGITUD","FECHA"};

    public GrillaControl(ArrayList<Control> ac) {
        this.ac = ac;
    }

    @Override
    public int getRowCount() {
        return ac.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ac.get(rowIndex).getUsuario().getNombre();
            case 1:
                return ac.get(rowIndex).getUsuario().getApellida();
            case 2:
                return ac.get(rowIndex).getLugar().getNombreLugar();
            case 3:
                return ac.get(rowIndex).getLatitud();
            case 4:
                return ac.get(rowIndex).getLongitud();
            case 5:
        {
            try {
                return fecha.fdate(ac.get(rowIndex).getFechaHora());
            } catch (ParseException ex) {
                Logger.getLogger(GrillaControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }

    public Control getLugar(int index) {
        return ac.get(index);
    } 
}
