package DataAccessObject;
import DataTransferObject.SociosDTO;
import DataTransferObject.AsociacionesDTO;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SociosDAO extends Conexion implements Crud<SociosDTO>{
    PreparedStatement ps;
    ResultSet rs;
    
    public SociosDTO buscar(SociosDTO sociosDTO) {
      try {
             int r=0;
             conexion=conectar();
             ps=conexion.prepareStatement("select * from Asociaciones where RUC=?");
             ps.setString(1, sociosDTO.getPlaca());
             sociosDTO=null;
             rs=ps.executeQuery();            
              while(rs.next())
             {
              sociosDTO=new SociosDTO();    
             sociosDTO.setNombre(rs.getString(1));
             sociosDTO.setApellido(rs.getString(2));
             sociosDTO.setDNI(rs.getString(3));
             sociosDTO.setPlaca(rs.getString(4));
             sociosDTO.setVigenciaFotocheck(rs.getString(5));
             }  
        } catch (Exception ex) {
              System.out.println(ex.getMessage());
              return null;
       }
        finally{
          cerrar();
          return sociosDTO;        
       }
    }  

    @Override
    public List<SociosDTO> listar() {
          List<SociosDTO> lista= new ArrayList<SociosDTO>();
        try {          
            conexion=conectar();
            ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, CONCAT(f.Fecha_emicion,' - ',f.Fecha_caducidad) as vigencia from MiembrosAsociacion ma\n" +
                                            "inner join Personas p\n" +
                                            "on ma.id_Persona = p.idPersona\n" +
                                            "inner join Fotocheck f\n" +
                                            "on ma.id_Persona = f.idPersona\n" +
                                            "inner join Conductores c\n" +
                                            "on ma.id_Persona = c.id_Persona\n" +
                                            "inner join Vehiculos v\n" +
                                            "on c.id_Vehiculo = v.idVehiculo\n");
            rs=ps.executeQuery(); 
            while(rs.next())
             {
             SociosDTO sociosDTO=new SociosDTO();
             sociosDTO.setNombre(rs.getString(1));
             sociosDTO.setApellido(rs.getString(2));
             sociosDTO.setDNI(rs.getString(3));
             sociosDTO.setPlaca(rs.getString(4));
             sociosDTO.setVigenciaFotocheck(rs.getString(5));
             lista.add(sociosDTO);
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
       public List<SociosDTO> buscarconLike(SociosDTO sociosDTO,AsociacionesDTO asociacionesDTO) {
        List<SociosDTO> lista=new ArrayList<SociosDTO>();
                try{
                    conexion=conectar();
                     ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, CONCAT(f.Fecha_emicion,' - ',f.Fecha_caducidad) as vigencia from MiembrosAsociacion ma\n" +
                                                    "inner join Personas p\n" +
                                                    "on ma.id_Persona = p.idPersona\n" +
                                                    "inner join Fotocheck f\n" +
                                                    "on ma.id_Persona = f.idPersona\n" +
                                                    "inner join Conductores c\n" +
                                                    "on ma.id_Persona = c.id_Persona\n" +
                                                    "inner join Vehiculos v\n" +
                                                    "on c.id_Vehiculo = v.idVehiculo\n" +
                                                    "where id_Asociacion=? and (p.Nombres like ? or p.ApellidoPaterno like ? or v.Placa like ?)");
                     ps.setString(1,asociacionesDTO.getIdAsociacion()+"%");
                     ps.setString(2,sociosDTO.getNombre()+"%");
                     ps.setString(3,sociosDTO.getApellido()+"%");
                     ps.setString(4,sociosDTO.getPlaca()+"%");
                     //ps.setString(2,asociacionesDTO.getRUC()+"%");
                    // System.out.println(asociacionesDTO.getNombre()+" "+asociacionesDTO.getRUC());
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    //System.out.println(rs.getString(2));
                    sociosDTO=new SociosDTO();    
                    sociosDTO.setNombre(rs.getString(1));
                    sociosDTO.setApellido(rs.getString(2));
                    sociosDTO.setDNI(rs.getString(3));
                    sociosDTO.setPlaca(rs.getString(4));
                    sociosDTO.setVigenciaFotocheck(rs.getString(5));
                    lista.add(sociosDTO);
                    
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
       
     public List<SociosDTO> buscar_por_asociacion(SociosDTO sociosDTO, AsociacionesDTO asociacionesDTO) {
        List<SociosDTO> lista=new ArrayList<SociosDTO>();
                try{
                    conexion=conectar();
                     ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, CONCAT(f.Fecha_emicion,' - ',f.Fecha_caducidad) as vigencia from MiembrosAsociacion ma\n" +
                                                    "inner join Personas p\n" +
                                                    "on ma.id_Persona = p.idPersona\n" +
                                                    "inner join Fotocheck f\n" +
                                                    "on ma.id_Persona = f.idPersona\n" +
                                                    "inner join Conductores c\n" +
                                                    "on ma.id_Persona = c.id_Persona\n" +
                                                    "inner join Vehiculos v\n" +
                                                    "on c.id_Vehiculo = v.idVehiculo\n" +
                                                    "where id_Asociacion = ?");
                    ps.setInt(1,asociacionesDTO.getIdAsociacion());
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    sociosDTO=new SociosDTO();    
                    sociosDTO.setNombre(rs.getString(1));
                    sociosDTO.setApellido(rs.getString(2));
                    sociosDTO.setDNI(rs.getString(3));
                    sociosDTO.setPlaca(rs.getString(4));
                    sociosDTO.setVigenciaFotocheck(rs.getString(5));
                    lista.add(sociosDTO);
                    
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
    public boolean agregar(SociosDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(SociosDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(SociosDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
