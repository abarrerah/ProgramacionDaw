package Entregable4;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class orderDetailsModel {

    public static void insertOrderDetails(orderDetails orderDetails){
        try{
            Connection con=DataConnection.getCon();
            PreparedStatement ps=con.prepareStatement("INSERT INTO orderdetails VALUES(?,?,?,?,?)");
            ps.setInt(1, orderDetails.getOrderNumber());
            ps.setString(2,orderDetails.getProductCode());
            ps.setInt(3, orderDetails.getQuantityOrdered());
            ps.setDouble(4, orderDetails.getPriceEach());
            ps.setInt(5, orderDetails.getOrderLineNumber());
            ps.executeUpdate();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
