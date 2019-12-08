import java.sql.*;
import javax.swing.*;

public class koneksi {
    Connection conn = null;
    
    public static Connection koneksidb(){
       try{
           Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\database\\school.db3");
           return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
    }
        
}
