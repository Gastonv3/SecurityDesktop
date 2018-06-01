/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Skylake
 */
public class Informe {

    private Integer idInformes;
    private String informe;
    private Usuario usuario;
    private Control control;
    private byte[] imagen;

    public Informe() {
    }

    public Integer getIdInformes() {
        return idInformes;
    }

    public void setIdInformes(Integer idInformes) {
        this.idInformes = idInformes;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

}
