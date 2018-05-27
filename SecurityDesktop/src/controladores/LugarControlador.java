/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.Lugar;
import util.conexion;

/**
 *
 * @author Skylake
 */
public class LugarControlador {

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

    public List<Lugar> extraertodo() throws SQLException {
        ArrayList<Lugar> aca = new ArrayList();
        //String query = "SELECT idLugares,nombreLugar,ubicacion,emails,estado FROM lugares;";
        String query = "SELECT * FROM lugares;";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Lugar ca = new Lugar();
                ca.setIdLugares(rs.getInt(1));
                ca.setNombreLugar(rs.getString(2));
                ca.setUbicacion(rs.getString(3));
                ca.setEmail(rs.getString(4));
                ca.setImagen(rs.getBytes(5));
                ca.setEstado(rs.getString(6));

                aca.add(ca);

            }
            //conexion.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
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

    public List<Lugar> buscar (String buscar) throws SQLException{
        ArrayList<Lugar> aca = new ArrayList();
        try {
            String query = "SELECT * FROM lugares WHERE nombreLugar LIKE '%"+buscar+"%' ORDER BY idLugares;";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {                
                Lugar ca = new Lugar();
                ca.setIdLugares(rs.getInt(1));
                ca.setNombreLugar(rs.getString(2));
                ca.setUbicacion(rs.getString(3));
                ca.setEmail(rs.getString(4));
                ca.setImagen(rs.getBytes(5));
                ca.setEstado(rs.getString(6));

                aca.add(ca);
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;
    }
}
