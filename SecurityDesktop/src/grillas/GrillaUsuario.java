/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grillas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objetos.PersonalAutorizado;
import objetos.Usuario;

/**
 *
 * @author Skylake
 */
public class GrillaUsuario extends AbstractTableModel {

    private ArrayList<Usuario> ac;
    private String titulos[] = {"NOMBRE", "APELLIDO", "DNI", "DIRECCION", "TELEFONO", "EMAIL",
        "TIPO USUARIO", "USER", "PASS", "ESTADO"};

    public GrillaUsuario(ArrayList<Usuario> ac) {
        this.ac = ac;
    }

    @Override
    public int getRowCount() {
        return ac.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ac.get(rowIndex).getNombre();
            case 1:
                return ac.get(rowIndex).getApellida();
            case 2:
                return ac.get(rowIndex).getDni();
            case 3:
                return ac.get(rowIndex).getDireccion();
            case 4:
                return ac.get(rowIndex).getTelefono();
            case 5:
                return ac.get(rowIndex).getEmail();
            case 6:
                return ac.get(rowIndex).getTipoUsuario();
            case 7:
                return ac.get(rowIndex).getUser();
            case 8:
                return ac.get(rowIndex).getPass();
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

            case 9:
                if ((ac.get(rowIndex).getEstado()).equals("0")) {
                    return "INACTIVO";
                } else {
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

    public Usuario getLugar(int index) {
        return ac.get(index);
    }
}
