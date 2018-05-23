/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitydesktop;

import controladores.LugarControlador;
import java.sql.SQLException;
import java.util.List;
import objetos.Lugar;

/**
 *
 * @author Gaston
 */
public class SecurityDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        LugarControlador controlador = new LugarControlador();
        List <Lugar> ca = controlador.extraertodo();
       
            System.out.println(ca);

    }
    
}
