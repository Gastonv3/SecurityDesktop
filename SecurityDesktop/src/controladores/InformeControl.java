/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import objetos.Control;
import objetos.Informe;
import objetos.Lugar;
import objetos.Usuario;
import util.conexion;

/**
 *
 * @author Skylake
 */
public class InformeControl {

    private conexion mysql = new conexion();
    private Connection conexion = mysql.conectar();
    private static ResultSet rs;

    public Lugar extraer(Integer id) throws SQLException {
        Lugar ca = new Lugar();
        String query = "SELECT idLugares,nombreLugar,ubicacion,emails,estado FROM lugares WHERE idLugares=" + id + ";";
        PreparedStatement ps = conexion.prepareStatement(query);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
            ca.setIdLugares(rs.getInt(1));
            ca.setNombreLugar(rs.getString(2));
            ca.setUbicacion(rs.getString(3));
            ca.setEmail(rs.getString(4));
            ca.setEstado(rs.getString(5));
        }
        conexion.close();
        return ca;
    }

    public List<Informe> extraertodo() throws SQLException {
        ArrayList<Informe> aca = new ArrayList();
        String query = "SELECT i.idInformes, l.nombreLugar, p.nombre, p.apellido, i.informe, c.fechaHora, i.imagenInforme "
                + "FROM informes i INNER JOIN controles c on i.idControl = c.idControles inner JOIN lugares l on c.idLugares = l.idLugares "
                + "INNER JOIN personas p on c.idGuardia = p.idPersona ORDER BY i.idInformes DESC";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Informe informe = new Informe();
                Lugar lugar = new Lugar();
                Control control = new Control();
                Usuario usuario = new Usuario();
                informe.setIdInformes(rs.getInt(1));
                lugar.setNombreLugar(rs.getString(2));
                usuario.setNombre(rs.getString(3));
                usuario.setApellida(rs.getString(4));
                informe.setInforme(rs.getString(5));
                control.setFechaHora(rs.getString(6));
                informe.setImagen(rs.getBytes(7));
                control.setLugar(lugar);
                control.setUsuario(usuario);
                informe.setControl(control);
                aca.add(informe);

            }
            //conexion.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        int Eliminador = ((aca.size()) - 1);
        aca.remove(Eliminador);
        return aca;

    }

    public void insetar(Lugar ca) throws SQLException {
        String query = "INSERT INTO `lugares` (`nombreLugar`, `ubicacion`, `emails`, `imagenLugar`, `estado`)"
                + "VALUES (?, ?, ?, ?, ?);";
        try {
            FileInputStream archivofoto;
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, ca.getNombreLugar());
            ps.setString(2, ca.getUbicacion());
            ps.setString(3, ca.getEmail());

            ps.setBytes(4, ca.getImagen());
            ps.setString(5, ca.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public void modificarSinImagen(Lugar ca) throws SQLException {
        String query = "UPDATE `lugares` SET `nombreLugar` = ?, `ubicacion` = ?, `emails` = ?, `estado` = ?"
                + " WHERE `lugares`.`idLugares` = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, ca.getNombreLugar());
            ps.setString(2, ca.getUbicacion());
            ps.setString(3, ca.getEmail());
            ps.setString(4, ca.getEstado());
            ps.setInt(5, ca.getIdLugares());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public void modificar(Lugar ca) throws SQLException {
        String query = "UPDATE `lugares` SET `nombreLugar` = ?, `ubicacion` = ?, `emails` = ?, `imagenLugar` = ?, `estado` = ?"
                + " WHERE `lugares`.`idLugares` = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, ca.getNombreLugar());
            ps.setString(2, ca.getUbicacion());
            ps.setString(3, ca.getEmail());
            ps.setBytes(4, ca.getImagen());
            ps.setString(5, ca.getEstado());
            ps.setInt(6, ca.getIdLugares());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public void eliminar(Lugar ca) throws SQLException {
        try {
            String query = "DELETE FROM lugares WHERE idLugares=?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, ca.getIdLugares());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public List<Informe> buscar(String busca) throws SQLException {
        ArrayList<Informe> aca = new ArrayList();
        try {
            String query = "SELECT i.idInformes, l.nombreLugar, p.nombre, p.apellido, i.informe, c.fechaHora, i.imagenInforme "
                    + "FROM informes i INNER JOIN controles c on i.idControl = c.idControles inner JOIN lugares l on c.idLugares = l.idLugares "
                    + "INNER JOIN personas p on c.idGuardia = p.idPersona WHERE (p.nombre LIKE'" + busca + "%' OR "
                    + "p.apellido LIKE'" + busca + "%' OR l.nombreLugar LIKE'" + busca + "%') ORDER BY i.idInformes DESC";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Informe informe = new Informe();
                Lugar lugar = new Lugar();
                Control control = new Control();
                Usuario usuario = new Usuario();
                informe.setIdInformes(rs.getInt(1));
                lugar.setNombreLugar(rs.getString(2));
                usuario.setNombre(rs.getString(3));
                usuario.setApellida(rs.getString(4));
                informe.setInforme(rs.getString(5));
                control.setFechaHora(rs.getString(6));
                informe.setImagen(rs.getBytes(7));
                control.setLugar(lugar);
                control.setUsuario(usuario);
                informe.setControl(control);
                aca.add(informe);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        int Eliminador = ((aca.size()) - 1);
        aca.remove(Eliminador);
        return aca;
    }

    public List<Informe> buscarfecha(String busca) throws SQLException {
        ArrayList<Informe> aca = new ArrayList();
        try {
            String query = "SELECT i.idInformes, l.nombreLugar, p.nombre, p.apellido, i.informe, c.fechaHora, i.imagenInforme "
                    + "FROM informes i INNER JOIN controles c on i.idControl = c.idControles inner JOIN lugares l on c.idLugares = l.idLugares "
                    + "INNER JOIN personas p on c.idGuardia = p.idPersona WHERE c.fechaHora LIKE'%" + busca + "%'ORDER BY i.idInformes DESC";
            
            String query2 = "SELECT c.idControles, p.nombre, p.apellido, l.nombreLugar, c.latitud, c.longitud, c.fechaHora "
                    + "FROM controles c INNER JOIN personas p on c.idGuardia = p.idpersona INNER JOIN lugares l on c.idLugares = l.idLugares "
                    + "WHERE c.fechaHora LIKE'%" + busca + "%' ORDER BY c.idControles DESC;";

            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Informe informe = new Informe();
                Lugar lugar = new Lugar();
                Control control = new Control();
                Usuario usuario = new Usuario();
                informe.setIdInformes(rs.getInt(1));
                lugar.setNombreLugar(rs.getString(2));
                usuario.setNombre(rs.getString(3));
                usuario.setApellida(rs.getString(4));
                informe.setInforme(rs.getString(5));
                control.setFechaHora(rs.getString(6));
                informe.setImagen(rs.getBytes(7));
                control.setLugar(lugar);
                control.setUsuario(usuario);
                informe.setControl(control);
                aca.add(informe);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }

        return aca;
    }
}
