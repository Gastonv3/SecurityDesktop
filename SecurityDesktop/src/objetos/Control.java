/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Gaston
 */
public class Control {
    private Integer idControles;
    private Usuario usuario;
    private Lugar lugar;
    private String latitud;
    private String longitud;
    private Date fechaHora;

    public Control() {
    }

    public Control(Integer idControles, Usuario usuario, Lugar lugar, String latitud, String longitud, Date fechaHora) {
        this.idControles = idControles;
        this.usuario = usuario;
        this.lugar = lugar;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fechaHora = fechaHora;
    }

    public Integer getIdControles() {
        return idControles;
    }

    public void setIdControles(Integer idControles) {
        this.idControles = idControles;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
