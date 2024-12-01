/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTransferObject;

/**
 *
 * @author Aaron
 */
public class SociosDTO {
    int idSocio;
    String nombre, apellido, DNI, placa, vigenciaFotocheck;

    public SociosDTO() {
    }

    public SociosDTO(int idSocio) {
        this.idSocio = idSocio;
    }
    
    
    public SociosDTO(String nombre, String apellido, String DNI, String placa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.placa = placa;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVigenciaFotocheck() {
        return vigenciaFotocheck;
    }

    public void setVigenciaFotocheck(String vigenciaFotocheck) {
        this.vigenciaFotocheck = vigenciaFotocheck;
    }
    
    
    
}
