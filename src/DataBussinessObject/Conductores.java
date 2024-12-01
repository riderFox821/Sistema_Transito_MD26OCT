/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBussinessObject;

import DataAccessObject.ConductoresDAO;
import DataTransferObject.ConductoresDTO;
import DataTransferObject.AsociacionesDTO;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class Conductores {
   ConductoresDAO conductoresDAO=new ConductoresDAO(); 
  ConductoresDTO conductoresDTO;
  AsociacionesDTO asociacionesDTO;
  
  public List<ConductoresDTO> listar()
  {
   if(conductoresDAO.listar()!=null)
   {
       return conductoresDAO.listar();   
   }  
     return null;  
  }
  
   public List<ConductoresDTO> buscarPorLike(String nombreuapellido)
  {
      conductoresDTO= new ConductoresDTO();
      conductoresDTO.setNombres(nombreuapellido);
      conductoresDTO.setNombres(nombreuapellido);
      
      if(conductoresDAO.buscarconLike(conductoresDTO).isEmpty())
      {
          return null;
      
      }else{
          if(conductoresDAO.buscarconLike(conductoresDTO)!=null)
              return conductoresDAO.buscarconLike(conductoresDTO);
              
      } 
            return null;
  
  }
   
    public List<ConductoresDTO> buscarPorIdAsociacion(int idAsociacion)
  {
      conductoresDTO= new ConductoresDTO();
      asociacionesDTO= new AsociacionesDTO();
      asociacionesDTO.setIdAsociacion(idAsociacion);
      
      if(conductoresDAO.buscar_por_asociacion(conductoresDTO,asociacionesDTO).isEmpty())
      {
          return null;
      
      }else{
          if(conductoresDAO.buscar_por_asociacion(conductoresDTO,asociacionesDTO)!=null)
              return conductoresDAO.buscar_por_asociacion(conductoresDTO,asociacionesDTO);
              
      } 
            return null;
  
  }
        public String agregar(String nombres, String apellido_paterno, String apellido_materno, String DNI, String numeloLicencia, String placa, int idAsociacion) {
        conductoresDTO = new ConductoresDTO();
        conductoresDTO.setNombres(nombres);
        conductoresDTO.setApellidoPaterno(apellido_paterno);
        conductoresDTO.setApellidoMaterno(apellido_materno);
        conductoresDTO.setDNI(DNI);
        conductoresDTO.setNumeroLicencia(numeloLicencia);
        conductoresDTO.setPlaca(placa);
        conductoresDTO.setIdAsociacion(idAsociacion);
        String Respuesta;
        if (conductoresDAO.agregar(conductoresDTO)) {
            Respuesta = "Operacion exitosa";
        } else {
            Respuesta = "Operacion fracasada";
        }
        return Respuesta;
    }
    
}
