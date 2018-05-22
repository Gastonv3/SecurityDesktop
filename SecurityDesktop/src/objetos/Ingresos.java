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
public class Ingresos {
    private Integer idIngresos;
    private Usuario usuario;
    private String nombreIngresante;
    private String apellidoIngresante;
    private String DNI;
    private String motivo;
    private Date fechaHora;

    public Ingresos() {
    }

    public Ingresos(Integer idIngresos, Usuario usuario, String nombreIngresante, String apellidoIngresante, String DNI, String motivo, Date fechaHora) {
        this.idIngresos = idIngresos;
        this.usuario = usuario;
        this.nombreIngresante = nombreIngresante;
        this.apellidoIngresante = apellidoIngresante;
        this.DNI = DNI;
        this.motivo = motivo;
        this.fechaHora = fechaHora;
    }

    public Integer getIdIngresos() {
        return idIngresos;
    }

    public void setIdIngresos(Integer idIngresos) {
        this.idIngresos = idIngresos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombreIngresante() {
        return nombreIngresante;
    }

    public void setNombreIngresante(String nombreIngresante) {
        this.nombreIngresante = nombreIngresante;
    }

    public String getApellidoIngresante() {
        return apellidoIngresante;
    }

    public void setApellidoIngresante(String apellidoIngresante) {
        this.apellidoIngresante = apellidoIngresante;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
