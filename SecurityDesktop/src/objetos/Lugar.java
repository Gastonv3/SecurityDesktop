/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.sql.Blob;

/**
 *
 * @author Gaston
 */
public class Lugar {
    private Integer idLugares;
    private String nombreLugar;
    private String ubicacion;
    private String email;
    private byte []imagen;

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
//private Blob dato; 

   /* public Lugar(Integer idLugares, String nombreLugar, String ubicacion, String email, Blob dato, String estado) {
        this.idLugares = idLugares;
        this.nombreLugar = nombreLugar;
        this.ubicacion = ubicacion;
        this.email = email;
        this.dato = dato;
        this.estado = estado;
    }*/

    public Lugar(String nombreLugar, String ubicacion, String email, String estado) {
        this.nombreLugar = nombreLugar;
        this.ubicacion = ubicacion;
        this.email = email;
        this.estado = estado;
    }

  /*  public Blob getDato() {
        return dato;
    }

    public void setDato(Blob dato) {
        this.dato = dato;
    }*/


    private String estado;
    
    public Lugar() {
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

    @Override
    public String toString() {
        return "Lugar{" + "idLugares=" + idLugares + ", nombreLugar=" + nombreLugar + ", ubicacion=" + ubicacion + ", email=" + email + ", estado=" + estado + '}';
    }


    
}
