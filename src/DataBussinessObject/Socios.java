/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBussinessObject;

import DataAccessObject.SociosDAO;
import DataTransferObject.AsociacionesDTO;
import DataTransferObject.SociosDTO;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class Socios {
    SociosDAO sociosDAO=new SociosDAO(); 
  SociosDTO sociosDTO;
  AsociacionesDTO asociacionesDTO;
    
    public List<SociosDTO> listar()
  {
   if(sociosDAO.listar()!=null)
   {
       return sociosDAO.listar();   
   }  
     return null;  
  }
  
   public List<SociosDTO> buscarPorLike(String nombreuapellidouplaca, int idAsociacion)
  {
      sociosDTO= new SociosDTO();
      asociacionesDTO = new AsociacionesDTO();
      asociacionesDTO.setIdAsociacion(idAsociacion);
      sociosDTO.setNombre(nombreuapellidouplaca);
      sociosDTO.setApellido(nombreuapellidouplaca);
      sociosDTO.setPlaca(nombreuapellidouplaca);
      
      if(sociosDAO.buscarconLike(sociosDTO, asociacionesDTO).isEmpty())
      {
          return null;
      
      }else{
          if(sociosDAO.buscarconLike(sociosDTO, asociacionesDTO)!=null)
              return sociosDAO.buscarconLike(sociosDTO, asociacionesDTO);
              
      } 
            return null;
  
  }
   
    public List<SociosDTO> buscarPorIdAsociacion(int idAsociacion)
  {
      sociosDTO= new SociosDTO();
      asociacionesDTO= new AsociacionesDTO();
      asociacionesDTO.setIdAsociacion(idAsociacion);
      
      if(sociosDAO.buscar_por_asociacion(sociosDTO,asociacionesDTO).isEmpty())
      {
          return null;
      
      }else{
          if(sociosDAO.buscar_por_asociacion(sociosDTO,asociacionesDTO)!=null)
              return sociosDAO.buscar_por_asociacion(sociosDTO,asociacionesDTO);
              
      } 
            return null;
  
  }
    
}
