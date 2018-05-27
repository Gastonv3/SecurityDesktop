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
import objetos.Lugar;
import objetos.PersonalAutorizado;
import util.conexion;

/**
 *
 * @author Skylake
 */
public class PersonalAutorizadoControl {

    private conexion mysql = new conexion();
    private Connection conexion = mysql.conectar();
    private static ResultSet rs;

    public PersonalAutorizado extraer(Integer id) throws SQLException {
        PersonalAutorizado personalAutorizado = new PersonalAutorizado();
        String query = "SELECT * FROM `personalautorizado` WHERE idPersonalAutorizado=" + id + ";";
        PreparedStatement ps = conexion.prepareStatement(query);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
            personalAutorizado.setIdPersonalAutorizado(rs.getInt(1));
            personalAutorizado.setNombrePersonalAutorizado(rs.getString(2));
            personalAutorizado.setApellidoPersonalAutorizado(rs.getString(3));
            personalAutorizado.setDNI(rs.getString(4));
            personalAutorizado.setCargo(rs.getString(5));
            personalAutorizado.setCodigo(rs.getString(6));
            personalAutorizado.setEstado(rs.getString(7));

        }

        return personalAutorizado;
    }

    public List<PersonalAutorizado> extraertodo() throws SQLException {
        ArrayList<PersonalAutorizado> aca = new ArrayList();
        //String query = "SELECT idLugares,nombreLugar,ubicacion,emails,estado FROM lugares;";
        String query = "SELECT * FROM personalautorizado;";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                PersonalAutorizado personalAutorizado = new PersonalAutorizado();
                personalAutorizado.setIdPersonalAutorizado(rs.getInt(1));
                personalAutorizado.setNombrePersonalAutorizado(rs.getString(2));
                personalAutorizado.setApellidoPersonalAutorizado(rs.getString(3));
                personalAutorizado.setDNI(rs.getString(4));
                personalAutorizado.setCargo(rs.getString(5));
                personalAutorizado.setCodigo(rs.getString(6));
                personalAutorizado.setEstado(rs.getString(7));

                aca.add(personalAutorizado);

            }
            //conexion.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;

    }

    public void insetar(PersonalAutorizado pa) throws SQLException {
        String query = "INSERT INTO `personalautorizado` (`nombrePersonalAutorizado`, `apellidoPersonalAutorizado`, `dni`, `cargo`, `codigo`, `estado`)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, pa.getNombrePersonalAutorizado());
            ps.setString(2, pa.getApellidoPersonalAutorizado());
            ps.setString(3, pa.getDNI());
            ps.setString(4, pa.getCargo());
            ps.setString(5, pa.getCodigo());
            ps.setString(6, pa.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public void modificar(PersonalAutorizado pa) throws SQLException {
        String query = "UPDATE `personalautorizado` SET `nombrePersonalAutorizado` = ?, `apellidoPersonalAutorizado` = ?, `dni` = ?, `cargo` = ?, `codigo` = ?, `estado` = ?"
                + "WHERE `personalautorizado`.`idPersonalAutorizado` = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, pa.getNombrePersonalAutorizado());
            ps.setString(2, pa.getApellidoPersonalAutorizado());
            ps.setString(3, pa.getDNI());
            ps.setString(4, pa.getCargo());
            ps.setString(5, pa.getCodigo());
            ps.setString(6, pa.getEstado());
            ps.setInt(7, pa.getIdPersonalAutorizado());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public void eliminar(PersonalAutorizado pa) throws SQLException {
        try {
            String query = "DELETE FROM personalautorizado WHERE idPersonalAutorizado=?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, pa.getIdPersonalAutorizado());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }

    }

    public List<PersonalAutorizado> buscar(String busca) throws SQLException {
        ArrayList<PersonalAutorizado> aca = new ArrayList();
        try {
            String query2 = "SELECT * FROM lugares WHERE nombreLugar LIKE '%" + busca + "%' ORDER BY idLugares;";
           
            String query ="SELECT * FROM personalautorizado WHERE (nombrePersonalAutorizado LIKE'" + busca + "%' OR "
                    + "apellidoPersonalAutorizado LIKE'" + busca + "%' OR dni LIKE'" + busca + "%' OR "
                    + "cargo LIKE'" + busca + "%' OR codigo LIKE'" + busca + "%') "
                    + "ORDER BY idPersonalAutorizado";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                PersonalAutorizado personalAutorizado = new PersonalAutorizado();
                personalAutorizado.setIdPersonalAutorizado(rs.getInt(1));
                personalAutorizado.setNombrePersonalAutorizado(rs.getString(2));
                personalAutorizado.setApellidoPersonalAutorizado(rs.getString(3));
                personalAutorizado.setDNI(rs.getString(4));
                personalAutorizado.setCargo(rs.getString(5));
                personalAutorizado.setCodigo(rs.getString(6));
                personalAutorizado.setEstado(rs.getString(7));

                aca.add(personalAutorizado);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;
    }
}
