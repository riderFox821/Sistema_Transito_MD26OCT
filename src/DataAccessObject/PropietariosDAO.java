package DataAccessObject;
import DataTransferObject.PropietariosDTO;
import DataTransferObject.AsociacionesDTO;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PropietariosDAO extends Conexion implements Crud<PropietariosDTO>{
    PreparedStatement ps;
    ResultSet rs;
    
    public PropietariosDTO buscar(PropietariosDTO propietariosDTO) {
      try {
             int r=0;
             conexion=conectar();
             ps=conexion.prepareStatement("select * from Asociaciones where RUC=?");
             ps.setString(1, propietariosDTO.getPlaca());
             propietariosDTO=null;
             rs=ps.executeQuery();            
              while(rs.next())
             {
              propietariosDTO=new PropietariosDTO();    
             propietariosDTO.setNombres(rs.getString(1));
             propietariosDTO.setApellidos(rs.getString(2));
             propietariosDTO.setDNI(rs.getString(3));
             propietariosDTO.setPlaca(rs.getString(4));
             propietariosDTO.setVigenciaSoat(rs.getString(5));
             }  
        } catch (Exception ex) {
              System.out.println(ex.getMessage());
              return null;
       }
        finally{
          cerrar();
          return propietariosDTO;        
       }
    }  

    @Override
    public List<PropietariosDTO> listar() {
          List<PropietariosDTO> lista= new ArrayList<PropietariosDTO>();
        try {          
            conexion=conectar();
            ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, pro.Vigencia_soat from Propietarios pro\n" +
                                            "inner join Personas p\n" +
                                            "on pro.id_Persona = p.idPersona\n" +
                                            "inner join Vehiculos v\n" +
                                            "on pro.id_Vehiculo = v.idVehiculo\n" +
                                            "inner join MiembrosAsociacion ma\n" +
                                            "on ma.id_Persona = p.idPersona");
            rs=ps.executeQuery(); 
            while(rs.next())
             {
             PropietariosDTO propietariosDTO=new PropietariosDTO();
             propietariosDTO.setNombres(rs.getString(1));
             propietariosDTO.setApellidos(rs.getString(2));
             propietariosDTO.setDNI(rs.getString(3));
             propietariosDTO.setPlaca(rs.getString(4));
             propietariosDTO.setVigenciaSoat(rs.getString(5));
             lista.add(propietariosDTO);
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
       public List<PropietariosDTO> buscarconLike( PropietariosDTO propietariosDTO) {
        List<PropietariosDTO> lista=new ArrayList<PropietariosDTO>();
                try{
                    conexion=conectar();
                     ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, pro.Vigencia_soat from Propietarios pro\n" +
                                                "inner join Personas p\n" +
                                                "on pro.id_Persona = p.idPersona\n" +
                                                "inner join Vehiculos v\n" +
                                                "on pro.id_Vehiculo = v.idVehiculo\n" +
                                                "inner join MiembrosAsociacion ma\n" +
                                                "on ma.id_Persona = p.idPersona\n" +
                                                "where p.Nombres like = ");
                     ps.setString(1,propietariosDTO.getNombres()+"%");
                     //ps.setString(2,asociacionesDTO.getRUC()+"%");
                    // System.out.println(asociacionesDTO.getNombre()+" "+asociacionesDTO.getRUC());
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    //System.out.println(rs.getString(2));
                   propietariosDTO=new PropietariosDTO();
                    propietariosDTO.setNombres(rs.getString(1));
                    propietariosDTO.setApellidos(rs.getString(2));
                    propietariosDTO.setDNI(rs.getString(3));
                    propietariosDTO.setPlaca(rs.getString(4));
                    propietariosDTO.setVigenciaSoat(rs.getString(5));
                    lista.add(propietariosDTO);
                    lista.add(propietariosDTO);
                    
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
       
     public List<PropietariosDTO> buscar_por_asociacion(PropietariosDTO propietariosDTO, AsociacionesDTO asociacionesDTO) {
        List<PropietariosDTO> lista=new ArrayList<PropietariosDTO>();
                try{
                    conexion=conectar();
                     ps=conexion.prepareStatement("select p.Nombres, CONCAT(p.ApellidoPaterno,' ',p.ApellidoMaterno) as apellidos, p.DNI, v.Placa, pro.Vigencia_soat from Propietarios pro\n" +
                                                    "inner join Personas p\n" +
                                                    "on pro.id_Persona = p.idPersona\n" +
                                                    "inner join Vehiculos v\n" +
                                                    "on pro.id_Vehiculo = v.idVehiculo\n" +
                                                    "inner join MiembrosAsociacion ma\n" +
                                                    "on ma.id_Persona = p.idPersona\n" +
                                                    "where ma.id_Asociacion = ?");
                    ps.setInt(1,asociacionesDTO.getIdAsociacion());
                    //productoDTO=null;
                    rs=ps.executeQuery();
                    while(rs.next()){
                    //ProductoDTO productoDTO=new  ProductoDTO();
                    propietariosDTO=new PropietariosDTO();    
                    propietariosDTO.setNombres(rs.getString(1));
                    propietariosDTO.setApellidos(rs.getString(2));
                    propietariosDTO.setDNI(rs.getString(3));
                    propietariosDTO.setPlaca(rs.getString(4));
                    propietariosDTO.setVigenciaSoat(rs.getString(5));
                    lista.add(propietariosDTO);
                    
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
    public boolean agregar(PropietariosDTO propietariosDTO) {
        try {
             int r=0;
             conexion=conectar();
             ps=conexion.prepareCall("execute insertar_propitario ?, ?, ?, ?, ?, ?, ?");
             ps.setString(1, propietariosDTO.getNombres());
             ps.setString(2, propietariosDTO.getApellidoPaterno());
             ps.setString(3,propietariosDTO.getApellidoMaterno());
             ps.setString(4,propietariosDTO.getDNI());
             ps.setString(5, propietariosDTO.getVigenciaSoat());
             ps.setString(6, propietariosDTO.getPlaca());
             ps.setInt(7, propietariosDTO.getIdAsociacion());
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
    public boolean actualizar(PropietariosDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(PropietariosDTO obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
