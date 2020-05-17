package Entregable2MySQL;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class ADClassicModels {
    public ADClassicModels() {}

    public List<Employee> getEmployees(){
        List<Employee> employees=new ArrayList<>();
        try{
            Connection con=DataConnection.getCon();

            Statement stm=con.createStatement();
            stm.setQueryTimeout(150);

            ResultSet rs=stm.executeQuery("SELECT*FROM employees");

            while (rs.next()){
                Employee emple=new Employee(rs.getInt("employeeNumber"),
                        rs.getString("lastName"),rs.getString("firstName"),
                        rs.getString("extension"),rs.getString("email"),
                        rs.getString("officeCode"),rs.getInt("reportsTo"),
                        rs.getString("jobTitle"));
                employees.add(emple);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return employees;
    }
    public List<Office> getOffice(){
        List<Office>offices=new ArrayList<>();
        try{
            Connection con=DataConnection.getCon();

            Statement stm=con.createStatement();
            stm.setQueryTimeout(150);

            ResultSet rs=stm.executeQuery("SELECT*FROM offices");

            while (rs.next()){
            Office office=new Office(rs.getString("officeCode"),
                    rs.getString("city"),rs.getString("phone"),
                    rs.getString("addressLine1"),rs.getString("addressLine2"),
                    rs.getString("State"),rs.getString("country"),
                    rs.getString("postalCode"),rs.getString("territory"));
            offices.add(office);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return offices;
    }
}
