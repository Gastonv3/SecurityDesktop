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
public class IngresoAutorizado {
    private Integer idIngresosAutorizados;
    private Usuario usuario;
    private PersonalAutorizado personalAutorizado;
    private Date fechaHora;

    public IngresoAutorizado() {
    }

    public IngresoAutorizado(Integer idIngresosAutorizados, Usuario usuario, PersonalAutorizado personalAutorizado, Date fechaHora) {
        this.idIngresosAutorizados = idIngresosAutorizados;
        this.usuario = usuario;
        this.personalAutorizado = personalAutorizado;
        this.fechaHora = fechaHora;
    }

    public Integer getIdIngresosAutorizados() {
        return idIngresosAutorizados;
    }

    public void setIdIngresosAutorizados(Integer idIngresosAutorizados) {
        this.idIngresosAutorizados = idIngresosAutorizados;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public PersonalAutorizado getPersonalAutorizado() {
        return personalAutorizado;
    }

    public void setPersonalAutorizado(PersonalAutorizado personalAutorizado) {
        this.personalAutorizado = personalAutorizado;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
