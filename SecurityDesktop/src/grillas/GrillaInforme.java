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
import objetos.Informe;
import objetos.Lugar;
import util.fecha;

/**
 *
 * @author Skylake
 */
public class GrillaInforme extends AbstractTableModel {

    private ArrayList<Informe> ac;
    private String titulos[] = {"NOMBRE", "APELLIDO", "LUGAR","INFORME","FECHA"};

    public GrillaInforme(ArrayList<Informe> ac) {
        this.ac = ac;
    }

    @Override
    public int getRowCount() {
        return ac.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ac.get(rowIndex).getControl().getUsuario().getNombre();
            case 1:
                return ac.get(rowIndex).getControl().getUsuario().getApellida();
            case 2:
                return ac.get(rowIndex).getControl().getLugar().getNombreLugar();
            case 3:
                return ac.get(rowIndex).getInforme();
            case 4:
        {
            try {
                return fecha.fdate(ac.get(rowIndex).getControl().getFechaHora());
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

    public Informe getLugar(int index) {
        return ac.get(index);
    }
}
