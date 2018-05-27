/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objetos.Lugar;
import objetos.PersonalAutorizado;

/**
 *
 * @author Skylake
 */
public class GrillaPersonalAutorizado extends AbstractTableModel{
    
    private ArrayList<PersonalAutorizado> ac;
    private String titulos[] = {"NOMBRE", "APELLIDO", "DNI","CARGO","CODIGO","ESTADO"};

    public GrillaPersonalAutorizado(ArrayList<PersonalAutorizado> ac) {
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
                return ac.get(rowIndex).getNombrePersonalAutorizado();
            case 1:
                return ac.get(rowIndex).getApellidoPersonalAutorizado();
            case 2:
                return ac.get(rowIndex).getDNI();
            case 3:
                return ac.get(rowIndex).getCargo();
            case 4:
                return ac.get(rowIndex).getCodigo();    
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
                
            case 5:
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

    public PersonalAutorizado getLugar(int index) {
        return ac.get(index);
    }
}
