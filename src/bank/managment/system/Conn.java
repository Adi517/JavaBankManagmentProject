
package bank.managment.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
            //register Driver
            // Class.forName(com.mysql.cj.jdbc.Driver);
            
            //connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagmentsystem","root" ,"codeforinterview");
            
            //Creating Statment
            s = c.createStatement();
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
