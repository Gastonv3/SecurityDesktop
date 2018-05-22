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
public class Lugar {
    private Integer idLugares;
    private String nombreLugar;
    private String ubicacion;
    private String email;
    private String estado;

    public Lugar() {
    }

    public Lugar(Integer idLugares, String nombreLugar, String ubicacion, String email, String estado) {
        this.idLugares = idLugares;
        this.nombreLugar = nombreLugar;
        this.ubicacion = ubicacion;
        this.email = email;
        this.estado = estado;
    }

    public Integer getIdLugares() {
        return idLugares;
    }

    public void setIdLugares(Integer idLugares) {
        this.idLugares = idLugares;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
