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
            ps=conexion.prepareStatement("select a.idAsociacion, a.Nombre, a.RUC, a.id_Persona_Representante_Legal, a.Domicilio_Legal, a.Ubicacion_paradero, p.Numero_permiso, CONCAT(fecha_emicion,' - ',fecha_caducidad) as vigencia from Asociaciones a\n" +
                                        "inner join Permisos p\n" +
                                        "on p.id_Asociacion = a.idAsociacion");
            rs=ps.executeQuery(); 
            while(rs.next())
             {
             AsociacionesDTO asociacionesDTO=new AsociacionesDTO();
             asociacionesDTO.setIdAsociacion(rs.getInt(1));
             asociacionesDTO.setNombre(rs.getString(2));
             asociacionesDTO.setRUC(rs.getString(3));
             asociacionesDTO.setDomicilio(rs.getString(5));
             asociacionesDTO.setUbicacionParadero(rs.getString(6));
             asociacionesDTO.setNumeroDePermiso(rs.getString(7));
             asociacionesDTO.setVigencia(rs.getString(8));
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
                     ps=conexion.prepareStatement("select a.idAsociacion, a.Nombre, a.RUC, a.id_Persona_Representante_Legal, a.Domicilio_Legal, a.Ubicacion_paradero, p.Numero_permiso, CONCAT(fecha_emicion,' - ',fecha_caducidad) as vigencia from Asociaciones a\n" +
                                                    "inner join Permisos p\n" +
                                                    "on p.id_Asociacion = a.idAsociacion where a.Nombre like ? or a.RUC like ?");
                     ps.setString(1,asociacionesDTO.getNombre()+"%");
                     ps.setString(2,asociacionesDTO.getRUC()+"%");
                    // System.out.println(asociacionesDTO.getNombre()+" "+asociacionesDTO.getRUC());
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    //System.out.println(rs.getString(2));
                    asociacionesDTO= new AsociacionesDTO();
                    asociacionesDTO.setIdAsociacion(rs.getInt(1));
                   asociacionesDTO.setNombre(rs.getString(2));
                    asociacionesDTO.setRUC(rs.getString(3));
                    asociacionesDTO.setDomicilio(rs.getString(5));
                    asociacionesDTO.setUbicacionParadero(rs.getString(6));
                    asociacionesDTO.setNumeroDePermiso(rs.getString(7));
                    asociacionesDTO.setVigencia(rs.getString(8));
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
