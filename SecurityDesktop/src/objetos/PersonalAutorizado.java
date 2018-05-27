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
public class PersonalAutorizado {

    private Integer idPersonalAutorizado;
    private String nombrePersonalAutorizado;
    private String apellidoPersonalAutorizado;
    private String DNI;
    private String cargo;
    private String codigo;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public PersonalAutorizado() {
    }

    public PersonalAutorizado(Integer idPersonalAutorizado, String nombrePersonalAutorizado, String apellidoPersonalAutorizado, String DNI, String cargo, String codigo) {
        this.idPersonalAutorizado = idPersonalAutorizado;
        this.nombrePersonalAutorizado = nombrePersonalAutorizado;
        this.apellidoPersonalAutorizado = apellidoPersonalAutorizado;
        this.DNI = DNI;
        this.cargo = cargo;
        this.codigo = codigo;
    }

    public Integer getIdPersonalAutorizado() {
        return idPersonalAutorizado;
    }

    public void setIdPersonalAutorizado(Integer idPersonalAutorizado) {
        this.idPersonalAutorizado = idPersonalAutorizado;
    }

    public String getNombrePersonalAutorizado() {
        return nombrePersonalAutorizado;
    }

    public void setNombrePersonalAutorizado(String nombrePersonalAutorizado) {
        this.nombrePersonalAutorizado = nombrePersonalAutorizado;
    }

    public String getApellidoPersonalAutorizado() {
        return apellidoPersonalAutorizado;
    }

    public void setApellidoPersonalAutorizado(String apellidoPersonalAutorizado) {
        this.apellidoPersonalAutorizado = apellidoPersonalAutorizado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
