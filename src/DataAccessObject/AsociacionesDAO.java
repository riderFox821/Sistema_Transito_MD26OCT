package DataAccessObject;
import DataTransferObject.AsociacionesDTO;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AsociacionesDAO extends Conexion implements Crud<AsociacionesDTO>{
    PreparedStatement ps;
    ResultSet rs;
   
    public AsociacionesDTO buscar(AsociacionesDTO asociacionesDTO) {
      try {
             int r=0;
             conexion=conectar();
             ps=conexion.prepareStatement("select * from Asociaciones where RUC=?");
             ps.setString(1,asociacionesDTO.getRUC());
             asociacionesDTO=null;
             rs=ps.executeQuery();            
              while(rs.next())
             {
              asociacionesDTO=new AsociacionesDTO();    
             asociacionesDTO.setNombre(rs.getString(2));
             asociacionesDTO.setRUC(rs.getString(3));
             asociacionesDTO.setDomicilio(rs.getString(5));
             asociacionesDTO.setUbicacionParadero(rs.getString(6));
             }  
        } catch (Exception ex) {
              System.out.println(ex.getMessage());
              return null;
       }
        finally{
          cerrar();
          return asociacionesDTO;        
       }
    }  

    @Override
    public List<AsociacionesDTO> listar() {
          List<AsociacionesDTO> lista= new ArrayList<AsociacionesDTO>();
        try {          
            conexion=conectar();
            ps=conexion.prepareStatement("select * from Asociaciones");
            rs=ps.executeQuery(); 
            while(rs.next())
             {
             AsociacionesDTO asociacionesDTO=new AsociacionesDTO();    
             asociacionesDTO.setNombre(rs.getString(2));
             asociacionesDTO.setRUC(rs.getString(3));
             asociacionesDTO.setDomicilio(rs.getString(5));
             asociacionesDTO.setUbicacionParadero(rs.getString(6));
             lista.add(asociacionesDTO);
             }  
        } catch (Exception ex) {
              System.out.println(ex.getMessage());
              return null;
       }
        finally{
          cerrar();
          return lista;        
       }
    }
       public List<AsociacionesDTO> buscarconLike( AsociacionesDTO asociacionesDTO) {
        List<AsociacionesDTO> lista=new ArrayList<AsociacionesDTO>();
                try{
                    conexion=conectar();
                     ps=conexion.prepareStatement("select * from Asociaciones where Nombre like ?");
                     ps.setString(1,asociacionesDTO.getNombre()+"%");
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    asociacionesDTO= new AsociacionesDTO();
                   asociacionesDTO.setNombre(rs.getString(2));
                    asociacionesDTO.setRUC(rs.getString(3));
                    asociacionesDTO.setDomicilio(rs.getString(5));
                    asociacionesDTO.setUbicacionParadero(rs.getString(6));
                    lista.add(asociacionesDTO);
                    
                    }
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                    return null;
                }
                finally{
                    cerrar();
                    return lista;
                } 
    }

    @Override
    public boolean agregar(AsociacionesDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(AsociacionesDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(AsociacionesDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
