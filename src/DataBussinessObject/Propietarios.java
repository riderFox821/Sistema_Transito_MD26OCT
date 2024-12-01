/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBussinessObject;

import DataAccessObject.PropietariosDAO;
import DataTransferObject.AsociacionesDTO;
import DataTransferObject.PropietariosDTO;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class Propietarios {

    PropietariosDAO propietariosDAO = new PropietariosDAO();
    PropietariosDTO propietariosDTO;
    AsociacionesDTO asociacionesDTO;

    public List<PropietariosDTO> listar() {
        if (propietariosDAO.listar() != null) {
            return propietariosDAO.listar();
        }
        return null;
    }

    public List<PropietariosDTO> buscarPorLike(String nombreuapellido) {
        propietariosDTO = new PropietariosDTO();
        propietariosDTO.setNombres(nombreuapellido);

        if (propietariosDAO.buscarconLike(propietariosDTO).isEmpty()) {
            return null;

        } else {
            if (propietariosDAO.buscarconLike(propietariosDTO) != null) {
                return propietariosDAO.buscarconLike(propietariosDTO);
            }

        }
        return null;

    }

    public List<PropietariosDTO> buscarPorIdAsociacion(int idAsociacion) {
        propietariosDTO = new PropietariosDTO();
        asociacionesDTO = new AsociacionesDTO();
        asociacionesDTO.setIdAsociacion(idAsociacion);

        if (propietariosDAO.buscar_por_asociacion(propietariosDTO, asociacionesDTO).isEmpty()) {
            return null;

        } else {
            if (propietariosDAO.buscar_por_asociacion(propietariosDTO, asociacionesDTO) != null) {
                return propietariosDAO.buscar_por_asociacion(propietariosDTO, asociacionesDTO);
            }

        }
        return null;

    }

    public String agregar(String nombres, String apellido_paterno, String apellido_materno, String DNI, String vigenciaSoat, String placa, int idAsociacion) {
        propietariosDTO = new PropietariosDTO();
        propietariosDTO.setNombres(nombres);
        propietariosDTO.setApellidoPaterno(apellido_paterno);
        propietariosDTO.setApellidoMaterno(apellido_materno);
        propietariosDTO.setDNI(DNI);
        propietariosDTO.setVigenciaSoat(vigenciaSoat);
        propietariosDTO.setPlaca(placa);
        propietariosDTO.setIdAsociacion(idAsociacion);
        String Respuesta;
        if (propietariosDAO.agregar(propietariosDTO)) {
            Respuesta = "Operacion exitosa";
        } else {
            Respuesta = "Operacion fracasada";
        }
        return Respuesta;
    }

}
