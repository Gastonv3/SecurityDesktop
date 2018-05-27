/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Skylake
 */
public interface IABM {

    public static final int ok = 1;
    public static final int nok = 2;
    public static final int error = 3;
    public static final int cerror = 4;

    int grabar();

    int comprobarErrores();

    public void inicio();

    public void actualizar();
}
