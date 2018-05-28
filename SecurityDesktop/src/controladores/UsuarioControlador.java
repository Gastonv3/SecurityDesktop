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
import objetos.PersonalAutorizado;
import objetos.Usuario;
import util.conexion;

/**
 *
 * @author Skylake
 */
public class UsuarioControlador {

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

    public List<Usuario> extraertodo() throws SQLException {
        ArrayList<Usuario> aca = new ArrayList();
        //String query = "SELECT idLugares,nombreLugar,ubicacion,emails,estado FROM lugares;";
        String query = "SELECT p.idPersona, p.nombre, p.apellido, p.dni, p.direccion, p.telefono, p.email, "
                + "u.tipoUsuario, u.user, u.pass, u.estado "
                + "FROM personas p INNER JOIN usuarios u on p.idPersona = u.idpersona;";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdPersona(rs.getLong(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellida(rs.getString(3));
                usuario.setDni(rs.getString(4));
                usuario.setDireccion(rs.getString(5));
                usuario.setTelefono(rs.getString(6));
                usuario.setEmail(rs.getString(7));
                usuario.setTipoUsuario(rs.getString(8));
                usuario.setUser(rs.getString(9));
                usuario.setPass(rs.getString(10));
                usuario.setEstado(rs.getString(11));

                aca.add(usuario);

            }
            //conexion.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;

    }

    public boolean insetar(Usuario u) throws SQLException {
        String query = "INSERT INTO `personas` (`nombre`, `apellido`, `dni`, `direccion`, `telefono`, `email`) "
                + "VALUES ( ?, ?,  ?,  ?,  ?,  ?)";
        String query2 = "INSERT INTO `usuarios` (`idpersona`, `tipoUsuario`, `user`, `pass`, `estado`) "
                + "VALUES ((SELECT idpersona FROM `personas` order by `idpersona` desc limit 1), ?, ?, ?, ?)";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);
            PreparedStatement ps2 = conexion.prepareStatement(query2);

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellida());
            ps.setString(3, u.getDni());
            ps.setString(4, u.getDireccion());
            ps.setString(5, u.getTelefono());
            ps.setString(6, u.getEmail());

            ps2.setString(1, u.getTipoUsuario());
            ps2.setString(2, u.getUser());
            ps2.setString(3, u.getPass());
            ps2.setString(4, u.getEstado());

        
            int n = ps.executeUpdate();
            if (n != 0) {
                int m = ps2.executeUpdate();
                if (m != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean modificar(Usuario u) throws SQLException {
        String query = "UPDATE `personas` SET `nombre` = ?, `apellido` = ?, `dni` = ?, `direccion` = ?,"
                + " `telefono` = ?, `email` = ? WHERE `personas`.`idPersona` = ?";
        String query2 = "UPDATE `usuarios` SET `tipoUsuario` = ?, `user` = ?, `pass` = ?, `estado` = ?"
                + " WHERE `usuarios`.`idpersona` = ?";

        PreparedStatement ps = conexion.prepareStatement(query);
        PreparedStatement ps2 = conexion.prepareStatement(query2);

        try {
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellida());
            ps.setString(3, u.getDni());
            ps.setString(4, u.getDireccion());
            ps.setString(5, u.getTelefono());
            ps.setString(6, u.getEmail());
            ps.setLong(7, u.getIdPersona());
            
            ps2.setString(1, u.getTipoUsuario());
            ps2.setString(2, u.getUser());
            ps2.setString(3, u.getPass());
            ps2.setString(4, u.getEstado());
            ps2.setLong(5, u.getIdPersona());

            int n = ps.executeUpdate();
            if (n != 0) {
                int m = ps2.executeUpdate();
                if (m != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean eliminar(Usuario u) throws SQLException {
        try {
            String query = "DELETE FROM `usuarios` WHERE `usuarios`.`idpersona` = ?";
            String query2 = "DELETE FROM `personas` WHERE `persona`.`idpersona` = ?";
            PreparedStatement pst = conexion.prepareStatement(query);
            PreparedStatement pst2 = conexion.prepareStatement(query2);
            pst.setLong(1, u.getIdPersona());

            pst2.setLong(1, u.getIdPersona());
            int n = pst.executeUpdate();
            if (n != 0) {
                int m = pst2.executeUpdate();
                if (m != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public List<Usuario> buscar(String busca) throws SQLException {
        ArrayList<Usuario> aca = new ArrayList();
        try {
            String query2 = "SELECT p.idPersona, p.nombre, p.apellido, p.dni, p.direccion, p.telefono, p.email, "
                + "u.tipoUsuario, u.user, u.pass, u.estado "
                + "FROM personas p INNER JOIN usuarios u on p.idPersona = u.idpersona WHERE (p.nombre LIKE'" + busca + "%' OR "
                    + "p.nombre LIKE'" + busca + "%' OR p.dni LIKE'" + busca + "%' OR "
                    + "p.direccion LIKE'" + busca + "%' OR p.telefono LIKE'" + busca + "%' OR u.tipoUsuario LIKE'" + busca + "%' OR u.user LIKE'" + busca + "%')ORDER BY p.idPersona;";

            String query = "SELECT * FROM personalautorizado WHERE (nombrePersonalAutorizado LIKE'" + busca + "%' OR "
                    + "apellidoPersonalAutorizado LIKE'" + busca + "%' OR dni LIKE'" + busca + "%' OR "
                    + "cargo LIKE'" + busca + "%' OR codigo LIKE'" + busca + "%') "
                    + "ORDER BY idPersonalAutorizado";
            Statement st = conexion.createStatement();
            rs = st.executeQuery(query2);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdPersona(rs.getLong(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellida(rs.getString(3));
                usuario.setDni(rs.getString(4));
                usuario.setDireccion(rs.getString(5));
                usuario.setTelefono(rs.getString(6));
                usuario.setEmail(rs.getString(7));
                usuario.setTipoUsuario(rs.getString(8));
                usuario.setUser(rs.getString(9));
                usuario.setPass(rs.getString(10));
                usuario.setEstado(rs.getString(11));

                aca.add(usuario);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return aca;
    }
}
