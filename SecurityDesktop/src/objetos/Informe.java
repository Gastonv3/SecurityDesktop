/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Gaston
 */
public class Informe {

    private Integer idInformes;
    private Control control;
    private String tituloInfome;
    private String informe;
    private byte[] imagen;

    public byte[] getImagen() {
        return imagen;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Informe() {
    }

    public Informe(Integer idInformes, Control control, String tituloInfome) {
        this.idInformes = idInformes;
        this.control = control;
        this.tituloInfome = tituloInfome;
    }

    public Integer getIdInformes() {
        return idInformes;
    }

    public void setIdInformes(Integer idInformes) {
        this.idInformes = idInformes;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public String getTituloInfome() {
        return tituloInfome;
    }

    public void setTituloInfome(String tituloInfome) {
        this.tituloInfome = tituloInfome;
    }

}
