package DataAccessObject;
import DataTransferObject.ConductoresDTO;
import DataTransferObject.AsociacionesDTO;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConductoresDAO extends Conexion implements Crud<ConductoresDTO>{
    PreparedStatement ps;
    ResultSet rs;
   
    public ConductoresDTO buscar(ConductoresDTO conductoresDTO) {
      try {
             int r=0;
             conexion=conectar();
             ps=conexion.prepareStatement("select * from Asociaciones where RUC=?");
             ps.setString(1,conductoresDTO.getDNI());
             conductoresDTO=null;
             rs=ps.executeQuery();            
              while(rs.next())
             {
              conductoresDTO=new ConductoresDTO();    
             conductoresDTO.setNombres(rs.getString(1));
             conductoresDTO.setApellidos(rs.getString(2));
             conductoresDTO.setDNI(rs.getString(3));
             conductoresDTO.setPlaca(rs.getString(5));
             conductoresDTO.setNumeroLicencia(rs.getString(5));
             }  
        } catch (Exception ex) {
              System.out.println(ex.getMessage());
              return null;
       }
        finally{
          cerrar();
          return conductoresDTO;        
       }
    }  

    @Override
    public List<ConductoresDTO> listar() {
          List<ConductoresDTO> lista= new ArrayList<ConductoresDTO>();
        try {          
            conexion=conectar();
            ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, c.Numero_Licencia from Conductores c\n" +
                                        "inner join Personas p\n" +
                                        "on c.id_Persona = p.idPersona\n" +
                                        "inner join Vehiculos v\n" +
                                        "on c.id_Vehiculo = v.idVehiculo");
            rs=ps.executeQuery(); 
            while(rs.next())
             {
             ConductoresDTO conductoresDTO=new ConductoresDTO();    
             conductoresDTO.setNombres(rs.getString(1));
             conductoresDTO.setApellidos(rs.getString(2));
             conductoresDTO.setDNI(rs.getString(3));
             conductoresDTO.setPlaca(rs.getString(5));
             conductoresDTO.setNumeroLicencia(rs.getString(5));
             lista.add(conductoresDTO);
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
       public List<ConductoresDTO> buscarconLike( ConductoresDTO conductoresDTO) {
        List<ConductoresDTO> lista=new ArrayList<ConductoresDTO>();
                try{
                    conexion=conectar();
                     ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, c.Numero_Licencia from Conductores c\n" +
                                        "inner join Personas p\n" +
                                        "on c.id_Persona = p.idPersona\n" +
                                        "inner join Vehiculos v\n" +
                                        "on c.id_Vehiculo = v.idVehiculo where Nombres like ? or ApellidoPaterno like ?");
                     ps.setString(1,conductoresDTO.getNombres()+"%");
                     ps.setString(2,conductoresDTO.getApellidos()+"%");
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    conductoresDTO=new ConductoresDTO();    
                    conductoresDTO.setNombres(rs.getString(1));
                    conductoresDTO.setApellidos(rs.getString(2));
                    conductoresDTO.setDNI(rs.getString(3));
                    conductoresDTO.setPlaca(rs.getString(5));
                    conductoresDTO.setNumeroLicencia(rs.getString(5));
                    lista.add(conductoresDTO);
                    
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
       
    public List<ConductoresDTO> buscar_por_asociacion(ConductoresDTO conductoresDTO, AsociacionesDTO asociacionesDTO) {
        List<ConductoresDTO> lista=new ArrayList<ConductoresDTO>();
                try{
                    conexion=conectar();
                     ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, con.Numero_Licencia from Conductores con\n" +
                                                    "inner join Personas p\n" +
                                                    "on con.id_Persona = p.idPersona\n" +
                                                    "inner join Vehiculos v\n" +
                                                    "on con.id_Vehiculo = v.idVehiculo\n" +
                                                    "inner join MiembrosAsociacion ma\n" +
                                                    "on ma.id_Persona = p.idPersona\n" +
                                                    "where ma.id_Asociacion = ?");
                     ps.setInt(1,asociacionesDTO.getIdAsociacion());
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    conductoresDTO=new ConductoresDTO();    
                    conductoresDTO.setNombres(rs.getString(1));
                    conductoresDTO.setApellidos(rs.getString(2));
                    conductoresDTO.setDNI(rs.getString(3));
                    conductoresDTO.setPlaca(rs.getString(5));
                    conductoresDTO.setNumeroLicencia(rs.getString(5));
                    lista.add(conductoresDTO);
                    
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
    public boolean agregar(ConductoresDTO conductoresDTO) {
        try {
             int r=0;
             conexion=conectar();
             ps=conexion.prepareCall("execute insertar_conductor ?, ?, ?, ?, ?, ?, ?");
             ps.setString(1, conductoresDTO.getNombres());
             ps.setString(2, conductoresDTO.getApellidoPaterno());
             ps.setString(3,conductoresDTO.getApellidoMaterno());
             ps.setString(4,conductoresDTO.getDNI());
             ps.setString(5, conductoresDTO.getNumeroLicencia());
             ps.setString(6, conductoresDTO.getPlaca());
             ps.setInt(7, conductoresDTO.getIdAsociacion());
             r=ps.executeUpdate();
             return (r==1);
         } catch (Exception ex) {
              System.out.println(ex.getMessage());
              return false;
         }
         finally{
         cerrar();
         }
    }

    @Override
    public boolean actualizar(ConductoresDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(ConductoresDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
