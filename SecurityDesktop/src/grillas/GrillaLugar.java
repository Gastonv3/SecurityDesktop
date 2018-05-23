/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grillas;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;
import objetos.Lugar;

/**
 *
 * @author Skylake
 */
public class GrillaLugar extends AbstractTableModel {

    private ArrayList<Lugar> ac;
    private String titulos[] = {"NOMBRE LUGAR", "UBICACION", "EMAIL","ESTADO"};

    public GrillaLugar(ArrayList<Lugar> ac) {
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
                return ac.get(rowIndex).getNombreLugar();
            case 1:
                return ac.get(rowIndex).getUbicacion();
            case 2:
                return ac.get(rowIndex).getEmail();
      /*      case 3:
                Blob blob= ac.get(rowIndex).getDato();
        {
            try {
                byte[] data = blob.getBytes(1, (int)blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {
                }
                 ImageIcon icon = new ImageIcon(img);
                 return  new JLabel(icon);
            } catch (SQLException ex) {
                Logger.getLogger(GrillaLugar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
                
            case 3:
                if((ac.get(rowIndex).getEstado()).equals("0")){
                     return "INACTIVO";
                }else{
                    return "ACTIVO";
                }
               
            default:
                return null;
        }
        
    }

    @Override
    public String getColumnName(int column) {
      return titulos[column];
    }

    public Lugar getLugar(int index) {
        return ac.get(index);
    }
}
