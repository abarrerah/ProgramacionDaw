package Entregable4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class OrdersModel {
    public static int inserOrders(Orders orders){
        int rowAffected=0;
        try{
            Connection con=DataConnection.getCon();
            PreparedStatement ps=con.prepareStatement("INSERT INTO orders VALUES(?,?,?,?,?,?,?);");
            ps.setInt(1,orders.getOrderNumber());
            ps.setDate(2, (Date) orders.getOrderDate());
            ps.setDate(3, (Date) orders.getRequiredDate());
            ps.setDate(4, (Date) orders.getShippedDate());
            ps.setString(5,orders.getStatus());
            ps.setString(6,orders.getComments());
            ps.setInt(7, orders.getCustomerNumber());
            rowAffected=ps.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rowAffected;
    }
}
