package tuki.persistences;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rocio
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBD = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBD, USER, PASSWORD);
            System.out.println("Conexión exitosa a : " + DATABASE);

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("FALLO DE CONEXIÓN  A: " + DATABASE);
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();      }   
        } catch (Exception ex ) {
            
                throw ex;        }
    }

protected void insertarModificarEliminar(String sql)throws Exception{
 try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            
            
            // conexion.rollback();
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda */
             
            throw ex;
        } finally {
            desconectarBase();
        }
    }
}

