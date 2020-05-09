package TareaSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection con=null;
        try{
            con= DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement statement = con.createStatement();
            statement.setQueryTimeout(150);
            ResultSet rs=statement.executeQuery("SELECT*FROM customers WHERE state is null");

            System.out.println("Listado de los customers que no tienen state (el campo state es nulo).");
            int i=1;
            while (rs.next()){

                System.out.println("------------------");
                System.out.println("| "+i+"-"+ rs.getString("customername")+" |");
                i=i+1;
            }
            System.out.println("------------------"+'\n');
            rs = statement.executeQuery("select * from payments where amount > 30000");

            System.out.println("Listado de los payments cuyo amount sea mayor de 30.000");
            i=1;
            while (rs.next()){
                System.out.println("------------");
                System.out.println("| "+i+"-" + rs.getInt("amount")+" |");
                i=i+1;
            }
            System.out.println("-------------"+'\n');
            rs = statement.executeQuery("select * from employees where reportsto = 1143");

            System.out.println("Listado de los employees que dan cuenta (reportsTo) al empleado con Id = 1143");
            i=1;
            while (rs.next()){
                System.out.println("----------------------");
                System.out.println("| "+i+"-" + rs.getString("firstname") + " " + rs.getString("lastname")+" |");
                i=i+1;
            }
            System.out.println("---------------------"+'\n');
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (con !=null){
                    con.close();
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
