package DataTransferObject;
public class AsociacionesDTO {
   int idAsociacion, idPersona_Representante;
   String domicilio,ubicacionParadero, nombre, RUC;

    public AsociacionesDTO() {
    }

    public AsociacionesDTO(String ruc) {
        this.RUC = ruc;
    }
    
    public AsociacionesDTO(int idAsociacion) {
        this.idAsociacion = idAsociacion;
    }

    public AsociacionesDTO(int idPersona_Representante, String domicilio, String ubicacionParadero, String nombre, String RUC) {
        this.idPersona_Representante = idPersona_Representante;
        this.domicilio = domicilio;
        this.ubicacionParadero = ubicacionParadero;
        this.nombre = nombre;
        this.RUC = RUC;
    }

    public AsociacionesDTO(String domicilio, String ubicacionParadero, String nombre) {
        this.domicilio = domicilio;
        this.ubicacionParadero = ubicacionParadero;
        this.nombre = nombre;
    }

    public int getIdAsociacion() {
        return idAsociacion;
    }

    public void setIdAsociacion(int idAsociacion) {
        this.idAsociacion = idAsociacion;
    }

    public int getIdPersona_Representante() {
        return idPersona_Representante;
    }

    public void setIdPersona_Representante(int idPersona_Representante) {
        this.idPersona_Representante = idPersona_Representante;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getUbicacionParadero() {
        return ubicacionParadero;
    }

    public void setUbicacionParadero(String ubicacionParadero) {
        this.ubicacionParadero = ubicacionParadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    
    
}
