/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import objetos.Control;
import objetos.Lugar;
import objetos.PersonalAutorizado;
import objetos.Usuario;
import util.conexion;

/**
 *
 * @author Skylake
 */
public class ControlControlador {

    private conexion mysql = new conexion();
    private Connection conexion = mysql.conectar();
    private static ResultSet rs;

    public List<Control> extraertodo() throws SQLException {
        ArrayList<Control> aca = new ArrayList();
        //String query = "SELECT idLugares,nombreLugar,ubicacion,emails,estado FROM lugares;";
        String query = "SELECT c.idControles, p.nombre, p.apellido, l.nombreLugar, c.latitud, c.longitud,c.fechaHora "
                + "FROM controles c INNER JOIN personas p on c.idGuardia = p.idpersona INNER JOIN lugares l on c.idLugares = l.idLugares ORDER BY c.idControles DESC;";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Control control = new Control();
                Usuario usuario = new Usuario();
                Lugar lugar = new Lugar();
                control.setIdControles(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellida(rs.getString(3));
                lugar.setNombreLugar(rs.getString(4));
                control.setLatitud(rs.getString(5));
                control.setLongitud(rs.getString(6));
                control.setFechaHora(rs.getString(7));
                control.setUsuario(usuario);
                control.setLugar(lugar);
                aca.add(control);

            }
            //conexion.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;

    }

    public List<Control> buscar(String busca) throws SQLException {
        ArrayList<Control> aca = new ArrayList();
        try {
            String query2 = "SELECT c.idControles, p.nombre, p.apellido, l.nombreLugar, c.latitud, c.longitud, c.fechaHora "
                    + "FROM controles c INNER JOIN personas p on c.idGuardia = p.idpersona INNER JOIN lugares l on c.idLugares = l.idLugares "
                    + "WHERE (p.nombre LIKE'" + busca + "%' OR "
                    + "p.apellido LIKE'" + busca + "%' OR l.nombreLugar LIKE'" + busca + "%')ORDER BY c.idControles DESC;";

            Statement st = conexion.createStatement();
            rs = st.executeQuery(query2);
            while (rs.next()) {
                Control control = new Control();
                Usuario usuario = new Usuario();
                Lugar lugar = new Lugar();
                control.setIdControles(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellida(rs.getString(3));
                lugar.setNombreLugar(rs.getString(4));
                control.setLatitud(rs.getString(5));
                control.setLongitud(rs.getString(6));
                control.setFechaHora(rs.getString(7));
                control.setUsuario(usuario);
                control.setLugar(lugar);
                aca.add(control);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;
    }

    public List<Control> buscarfecha(String busca) throws SQLException {
        ArrayList<Control> aca = new ArrayList();
        try {
            String query2 = "SELECT c.idControles, p.nombre, p.apellido, l.nombreLugar, c.latitud, c.longitud, c.fechaHora "
                    + "FROM controles c INNER JOIN personas p on c.idGuardia = p.idpersona INNER JOIN lugares l on c.idLugares = l.idLugares "
                    + "WHERE c.fechaHora LIKE'%" + busca + "%' ORDER BY c.idControles DESC;";

            Statement st = conexion.createStatement();
            rs = st.executeQuery(query2);
            while (rs.next()) {
                Control control = new Control();
                Usuario usuario = new Usuario();
                Lugar lugar = new Lugar();
                control.setIdControles(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellida(rs.getString(3));
                lugar.setNombreLugar(rs.getString(4));
                control.setLatitud(rs.getString(5));
                control.setLongitud(rs.getString(6));
                control.setFechaHora(rs.getString(7));
                control.setUsuario(usuario);
                control.setLugar(lugar);
                aca.add(control);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;
    }
}
