/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBussinessObject;

import DataAccessObject.AsociacionesDAO;
import DataTransferObject.AsociacionesDTO;

import java.util.List;

/**
 *
 * @author Aaron
 */
public class Asociaciones {
    
 AsociacionesDAO asociacionesDAO=new AsociacionesDAO(); 
  AsociacionesDTO asociacionesDTO;
  
  public List<AsociacionesDTO> listar()
  {
   if(asociacionesDAO.listar()!=null)
   {
       return asociacionesDAO.listar();   
   }  
     return null;  
  }
  public List<AsociacionesDTO> buscarPorLike(String ruc_o_nombre)
  {
      asociacionesDTO= new AsociacionesDTO();
      asociacionesDTO.setNombre(ruc_o_nombre);
      asociacionesDTO.setRUC(ruc_o_nombre);
      
      //System.out.println(asociacionesDTO.getNombre()+" "+asociacionesDTO.getRUC());
      
      if(asociacionesDAO.buscarconLike(asociacionesDTO).isEmpty())
      {
          return null;
      
      }else{
          if(asociacionesDAO.buscarconLike(asociacionesDTO)!=null)
              return asociacionesDAO.buscarconLike(asociacionesDTO);
              
      } 
            return null;
  
  }
    
}
