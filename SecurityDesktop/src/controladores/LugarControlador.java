/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

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
                ca.setDato(rs.getBlob(5));
                ca.setEstado(rs.getString(6));

                aca.add(ca);

            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;

    }

    public void insetar(Lugar ca) throws SQLException {
        String query = "INSERT INTO `lugares` (`nombreLugar`, `ubicacion`, `emails`, `estado`)"
                + "VALUES (?, ?, ?, '1');";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, ca.getNombreLugar());
            ps.setString(2, ca.getUbicacion());
            ps.setString(3, ca.getEmail());
            ps.setString(4, ca.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public void modificar(Lugar ca) throws SQLException {
        String query = "UPDATE `lugares` SET `nombreLugar` = ?, `ubicacion` = ?,`emails` = ?, `estado` = ?"
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
    /*public List<Categoria> buscar (String buscar) throws SQLException{
        ArrayList<Categoria> aca = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            String cn = "jdbc:postgresql://localhost:5432/stock";
            conexion = DriverManager.getConnection(cn, "postgres", "123456");
            String query = "SELECT * FROM categoria WHERE nombre LIKE '%"+buscar+"%' ORDER BY id;";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {                
                Categoria ca = new Categoria();
                ca.setId(rs.getLong(1));
                ca.setNombre(rs.getString(2));
                ca.setEstado(rs.getInt(3));
                aca.add(ca);
            }
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aca;
    }*/
}
