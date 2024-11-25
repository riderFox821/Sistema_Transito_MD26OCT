
package DataTransferObject;

/**
 *
 * @author Aaron
 */
public class ConductoresDTO {
    String Nombres, Apellidos, DNI, Placa, NumeroLicencia;
    int idPersona, idVehiculo;

    public ConductoresDTO() {
    }

    public ConductoresDTO(String Nombres, String Apellidos, String DNI, String Placa, String NumeroLicencia) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.Placa = Placa;
        this.NumeroLicencia = NumeroLicencia;
    }

    public ConductoresDTO(String NumeroLicencia, int idPersona, int idVehiculo) {
        this.NumeroLicencia = NumeroLicencia;
        this.idPersona = idPersona;
        this.idVehiculo = idVehiculo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getNumeroLicencia() {
        return NumeroLicencia;
    }

    public void setNumeroLicencia(String NumeroLicencia) {
        this.NumeroLicencia = NumeroLicencia;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    
}
