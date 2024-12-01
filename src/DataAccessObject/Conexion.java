package DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Aaron Salvador Ramirez
 */
public class Conexion {
    protected Connection conexion;
    String url="jdbc:sqlserver://LAPTOP-FDEOJVKI:1433;databaseName=registro_transito_muni_26OCT";
    String user="sa";
    String password="123456";
    public Connection conectar()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion=DriverManager.getConnection(url,user,password);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
      return conexion;
    }    
    public void cerrar()
    {
      if(conexion!=null)
          try {
              if(!conexion.isClosed())
                  conexion.close();
      } catch (Exception ex) {
            System.out.println(ex.getMessage());
      }
    }        
}