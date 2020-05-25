package Entregable4;
import EjemploEntregable4.Employee;
import EjemploEntregable4.EmployeeModel;
import EjemploEntregable4.Office;
import EjemploEntregable4.OfficeModel;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class Transiciones {
    public static void main(String[] args) {
        Connection con=DataConnection.getCon();
        try{
            con.setAutoCommit(false);
            OfficeModel.insertarOficina(
                    new Office(
                            "9",
                            "Sevilla",
                            "+34 657 23 55 64",
                            "Avenida Johnny Melavo",
                            "default",
                            "Andalucía",
                            "España",
                            "41800",
                            "EMEA"
                    )
            );
            System.out.println("Insertar nueva oficina completada");

            EmployeeModel.insertEmployee(
                    new Employee(
                            8001,
                            "Fernandez",
                            "Juan",
                            "x8000",
                            "jFernandez@gmail.com",
                            "9",
                            1102,
                            "Sales Rep"
                    )
            );
            EmployeeModel.insertEmployee(
                    new Employee(
                            8002,
                            "García",
                            "Ana",
                            "x8000",
                            "agarciah95@gmail.com",
                            "9",
                            1102,
                            "Sales Rep"
                    )
            );

            CustomerModel.insertCustomer(
                    new Customers(
                    504,
                            "Abraham",
                            "Barrera",
                            "Herrera",
                            "65642345",
                            "MICasa7",
                            "Micasita 8",
                            "Sevilla",
                            "Andalucía",
                            "41800",
                            "España",
                            8001,
                            506
                    )
            );
            CustomerModel.insertCustomer(
                    new Customers(
                            505,
                            "Zayra",
                            "Casas",
                            "Fernandez",
                            "65642345",
                            "MICasa7",
                            "Micasita 8",
                            "Sevilla",
                            "Andalucía",
                            "41800",
                            "España",
                            8002,
                            506
                    )
            );
            Date now = new Date();
            java.sql.Date sqlDate = new java.sql.Date(now.getTime());



            OrdersModel.inserOrders(
                    new Orders(
                    10426,
                            sqlDate,
                            sqlDate,
                            null,
                            "In Process",
                            "hola",
                            504

                    )
            );
            OrdersModel.inserOrders(
                    new Orders(
                            10427,
                            sqlDate,
                            sqlDate,
                            null,
                            "In Process",
                            "hola",
                            505

                    )
            );
            orderDetailsModel.insertOrderDetails(
                    new orderDetails(
                            10426,
                            "S18_1749",
                            10,
                            136.00,
                            3
                    )
            );
            orderDetailsModel.insertOrderDetails(
                    new orderDetails(
                            10427,
                            "S18_1749",
                            10,
                            136.00,
                            3
                    )
            );
            con.commit();

            try{

                Statement statement=con.createStatement();
                statement.setQueryTimeout(150);
                ResultSet rs=statement.executeQuery("SELECT c.customerName,e.firstName,o.city FROM customers c INNER JOIN employees e ON c.salesRepEmployeeNumber=e.employeeNumber INNER JOIN offices o ON e.officeCode=o.officeCode WHERE c.customerNumber=504");
                while(rs.next()){
                    System.out.println("--------------------------------------");
                    System.out.println("| "+rs.getString("customerName")+" | "+rs.getString("firstName")+" | "+rs.getString("city")+" |");
                    System.out.println("--------------------------------------");

                }
                rs.close();
                ResultSet rs2=statement.executeQuery("SELECT c.customerName,e.firstName,o.city FROM customers c INNER JOIN employees e ON c.salesRepEmployeeNumber=e.employeeNumber INNER JOIN offices o ON e.officeCode=o.officeCode WHERE c.customerNumber=505");
                while(rs2.next()){
                    System.out.println("--------------------------------------");
                    System.out.println("| "+rs2.getString("customerName")+" | "+rs2.getString("firstName")+" | "+rs2.getString("city")+" |");
                    System.out.println("--------------------------------------");

                }
                rs2.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            try{

                Statement statement=con.createStatement();
                statement.setQueryTimeout(150);
                ResultSet rs=statement.executeQuery("SELECT c.customerName,od.orderDate,od.status,p.productName,odd.quantityOrdered,odd.priceEach FROM customers c  INNER JOIN orders od ON c.customerNumber=od.customerNumber INNER JOIN orderdetails odd ON od.orderNumber=odd.orderNumber INNER JOIN products p ON odd.productCode=p.productCode WHERE c.customerNumber=504;");
                while(rs.next()){
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("| "+rs.getString("customerName")+" | "+rs.getDate("orderDate")+" | "+rs.getString("status")+" | "+rs.getString("productName")+" | "+rs.getInt("quantityOrdered")+" | "+rs.getDouble("priceEach")+" |");
                    System.out.println("----------------------------------------------------------------------------");

                }
                ResultSet rs2=statement.executeQuery("SELECT c.customerName,od.orderDate,od.status,p.productName,odd.quantityOrdered,odd.priceEach FROM customers c  INNER JOIN orders od ON c.customerNumber=od.customerNumber INNER JOIN orderdetails odd ON od.orderNumber=odd.orderNumber INNER JOIN products p ON odd.productCode=p.productCode WHERE c.customerNumber=505;");
                while(rs2.next()){
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("| "+rs2.getString("customerName")+" | "+rs2.getDate("orderDate")+" | "+rs2.getString("status")+" | "+rs2.getString("productName")+" | "+rs2.getInt("quantityOrdered")+" | "+rs2.getDouble("priceEach")+" |");
                    System.out.println("----------------------------------------------------------------------------");

                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            try {
                if (con !=null){
                    System.out.println("Dejamos la bd en estado conssitente.");
                    con.rollback();

                }
            } catch (SQLException throwables) {

                throwables.printStackTrace();
            }
        }

    }
}
