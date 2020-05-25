package Entregable4;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerModel {
    public static void insertCustomer(Customers customer){
        try{
            Connection con=DataConnection.getCon();
            PreparedStatement ps=con.prepareStatement("INSERT INTO customers VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,customer.getCustomerNumber());;
            ps.setString(2,customer.getCustomerName());
            ps.setString(3,customer.getContactLastName());
            ps.setString(4,customer.getContactFirstName());
            ps.setString(5,customer.getPhone());
            ps.setString(6,customer.getAddressLine1());
            ps.setString(7,customer.getAddressLine2());
            ps.setString(8,customer.getPostalCode());
            ps.setString(9,customer.getCity());
            ps.setString(10,customer.getState());
            ps.setString(11,customer.getPostalCode());
            ps.setInt(12,customer.getSalesRepEmployeeNumber());
            ps.setDouble(13,customer.getCreditLimit());
            ps.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
