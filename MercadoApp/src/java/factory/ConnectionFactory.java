package factory;

import com.sun.istack.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class ConnectionFactory {
    
    private static Connection conexao;
    private static final String URL_CONEXAO="jdbc://mysql://localhost:3306/dbapp";
    private static final String USUARIO="root";
    private static final String SENHA="123456";
    
    public static Connection getConexao(){
        if (conexao==null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexao= DriverManager.getConnection(null);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexao;
           
         
        }
    
    public static void fecharConexao(){
        if (conexao !=null) {
            try {
                conexao.close();
                conexao=null;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
   
}
