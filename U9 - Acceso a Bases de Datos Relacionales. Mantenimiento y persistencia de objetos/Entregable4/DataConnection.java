
package Entregable4;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnection {

    private static Connection con=null;
    public static Connection getCon(){
        try {
            if (con==null){
                con=DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=adminadmin1234T-");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    public static void close(){
        try{
            con.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
