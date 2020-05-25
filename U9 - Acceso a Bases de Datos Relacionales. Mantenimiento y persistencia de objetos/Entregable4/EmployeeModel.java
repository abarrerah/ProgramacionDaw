package Entregable4;

import EjemploEntregable4.DataConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeModel {
    public static Integer insertEmployee(Employee employee){
        int rowAffected=0;
        try{
            Connection con= DataConnection.getCon();
            PreparedStatement ps=con.prepareStatement
                    ("INSERT INTO employees VALUES(?,?,?,?,?,?,?,?);");

            ps.setInt(1,employee.getEmployeeNumber());
            ps.setString(2,employee.getLastName());
            ps.setString(3,employee.getFirstName());
            ps.setString(4,employee.getExtension());
            ps.setString(5,employee.getEmail());
            ps.setString(6,employee.getOfficeCode());
            ps.setInt(7,employee.getReportsTo());
            ps.setString(8,employee.getJobTitle());
            rowAffected=ps.executeUpdate();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rowAffected;
    }
}
