package Entregable4;

import EjemploEntregable4.DataConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OfficeModel {
    public static void insertarOficina(Office office){
        try{
            Connection con= DataConnection.getCon();
            PreparedStatement ps=con.prepareStatement("INSERT INTO offices(officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory) VALUES(?,?,?,?,?,?,?,?,?);");
            ps.setString(1,office.getOfficeCode());
            ps.setString(2,office.getCity());
            ps.setString(3,office.getPhone());
            ps.setString(4,office.getAddressLine1());
            ps.setString(5,office.getAddressLine2());
            ps.setString(6,office.getState());
            ps.setString(7,office.getCountry());
            ps.setString(8,office.getPostalCode());
            ps.setString(9,office.getTerritory());
            ps.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
