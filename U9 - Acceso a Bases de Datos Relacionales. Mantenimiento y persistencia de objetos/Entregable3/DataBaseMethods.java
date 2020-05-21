package Entregable3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;

public class DataBaseMethods {
    public int existsNumber(){
        int numEmple=0;
        try{
            Scanner sc=new Scanner(System.in);
            Connection con=DataConnection.getCon();

            boolean exist=false;
            do{
                System.out.println("Dime el número del empleado.");
                numEmple= sc.nextInt();
                PreparedStatement ps = con.prepareStatement("select employeeNumber from employees where employeeNumber=" + numEmple + ";");
                ResultSet rs = ps.executeQuery();

                if (rs.next()){
                    exist = true;
                } else {
                    System.out.println("No existe ese empleado en la base de datos.");
                    System.out.println("Te voy a mostrar los números de empleados existente.");
                    PreparedStatement ps2=con.prepareStatement("select lastName,firstName,employeeNumber from employees");
                    ResultSet rs2=ps2.executeQuery();
                    while (rs2.next()){
                        System.out.println("Numero del empleado "+rs2.getString("firstName")
                                +" "+rs2.getString("lastName")+" : "+rs2.getString("employeeNumber"));

                    }

                }
            }while (!exist);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return numEmple;
    }
    public static void addCliente(){
        Scanner sc=new Scanner(System.in);
        try {
            Connection con=DataConnection.getCon();
            String sql = "INSERT INTO customers (customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.println("Número del cliente. ");
            int customerNumber = sc.nextInt();
            statement.setInt(1, customerNumber);

            sc.nextLine();

            System.out.println("Nombre del cliente. ");
            String customerName = sc.nextLine();
            statement.setString(2, customerName);

            System.out.println("primer apellido del cliente.");
            String contactLastName = sc.nextLine();
            statement.setString(3, contactLastName);

            System.out.println("segundo apellido del cliente. ");
            String contactFirstName = sc.nextLine();
            statement.setString(4, contactFirstName);

            System.out.println("Teléfono de contacto. ");
            String phone = sc.nextLine();
            statement.setString(5, phone);

            System.out.println("Dirección principal. ");
            String addressLine1 = sc.nextLine();
            statement.setString(6, addressLine1);

            System.out.println("Dirección opcional. ");
            String addressLine2 = sc.nextLine();
            statement.setString(7, addressLine2);

            System.out.println("Ciudad. ");
            String city = sc.nextLine();
            statement.setString(8, city);

            System.out.println("Provincia. ");
            String state = sc.nextLine();
            statement.setString(9, state);

            System.out.println("Código postal. ");
            String postalCode = sc.nextLine();
            statement.setString(10, postalCode);

            System.out.println("País. ");
            String country = sc.nextLine();
            statement.setString(11, country);


            DataBaseMethods dbm=new DataBaseMethods();
            int salesRepEmployeeNumber = dbm.existsNumber();
            statement.setInt(12, salesRepEmployeeNumber);

            System.out.println("Crédito del usuario. ");
            double creditLimit = sc.nextDouble();
            statement.setDouble(13, creditLimit);

            statement.executeUpdate();

            System.out.println("Ok");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public int existCliente(){
        int numCustomer=0;
        try{
            Scanner sc=new Scanner(System.in);
            Connection con=DataConnection.getCon();

            boolean exist=false;
            do{
                System.out.println("Dime el número del Cliente.");
                numCustomer= sc.nextInt();
                PreparedStatement ps = con.prepareStatement("select customerNumber from customers where customerNumber=" + numCustomer+ ";");
                ResultSet rs = ps.executeQuery();

                if (rs.next()){
                    exist = true;
                } else {
                    System.out.println("No existe ese cliente en la base de datos.");
                    System.out.println("Te voy a mostrar los números de empleados existente.");
                    PreparedStatement ps2=con.prepareStatement("select customerName,customerNumber from customers");
                    ResultSet rs2=ps2.executeQuery();
                    while (rs2.next()){
                        System.out.println("Numero del cliente "+rs2.getString("customerName")
                                +" "+rs2.getString("customerNumber"));

                    }

                }
            }while (!exist);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return numCustomer;
    }
    public static void asignEmployee(){
        Connection con=DataConnection.getCon();

        try{
            int i=0;
            int k=0;
            DataBaseMethods dbm=new DataBaseMethods();
            i=dbm.existsNumber();
            k=dbm.existCliente();
            String sql = "UPDATE customers SET salesRepEmployeeNumber = " + i + " WHERE customerNumber = " + k;
            PreparedStatement statement = con.prepareStatement(sql);

            statement = con.prepareStatement(sql);

            statement.executeUpdate();

            System.out.println("Datos modificados.");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int existOrder(){
        int numOrder=0;
        try{
            Scanner sc=new Scanner(System.in);
            Connection con=DataConnection.getCon();

            boolean exist=false;
            System.out.println("Dime el número del pedido.");
            PreparedStatement ps = con.prepareStatement("select orderNumber from orders where orderNumber=" + numOrder+ ";");
            ResultSet rs = ps.executeQuery();
            while (!exist) {

                System.out.println("ID del pedido: ");
                numOrder = sc.nextInt();

                while (rs.next()) {
                    int number = rs.getInt("orderNumber");

                    if (numOrder == number) {
                        exist = true;
                        break;
                    }

                }

                if (!exist) {
                    System.out.println("No existe ese pedido.");
                    ps.executeQuery();
                    return numOrder;
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return numOrder;
    }
    public String existProduct(){
        String numProduct="";
        Scanner sc=new Scanner(System.in);
        try{
            Connection con=DataConnection.getCon();
            boolean exist=false;
            do{
                System.out.println("Dime el número del producto");
                numProduct= sc.next();
                PreparedStatement ps = con.prepareStatement("select productCode from products where productCode=" +"'"+ numProduct+"'"+ ";");
                ResultSet rs = ps.executeQuery();

                if (rs.next()){
                    exist = true;
                } else {
                    System.out.println("No existe ese producto en la base de datos.");
                    System.out.println("Te voy a mostrar los productos existente.");
                    PreparedStatement ps2=con.prepareStatement("select productCode from products");
                    ResultSet rs2=ps2.executeQuery();
                    while (rs2.next()){
                        System.out.println("Numero del producto: "+rs2.getString("productCode"));

                    }

                }
            }while (!exist);



        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return numProduct;
    }
    public static void addProduct(){
    Connection con=DataConnection.getCon();
    DataBaseMethods dbm=new DataBaseMethods();
    Scanner sc=new Scanner(System.in);
    try{
        PreparedStatement ps=con.prepareStatement("INSERT INTO orderdetails (orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber) VALUES(?,?,?,?,?);");
        int on=dbm.existOrder();
        ps.setInt(1,on);
        String cp=dbm.existProduct();
        ps.setString(2,cp);
        System.out.println("Dime la cantidad ordenada");
        int cant=sc.nextInt();
        ps.setInt(3,cant);
        System.out.println("Dime el precio");
        double price=sc.nextDouble();
        ps.setDouble(4,price);
        System.out.println("Dime el numero de línea de la orden");
        int nlo=sc.nextInt();
        ps.setDouble(5,nlo);
        ps.executeUpdate();
        System.out.println("Datos añadidos al producto");

    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }

    public static void showDetails(){
        Scanner sc= new Scanner(System.in);
        try {
            Connection connection = DataConnection.getCon();
            PreparedStatement ps= connection.prepareStatement("select * from orderdetails;");
            ResultSet rs = ps.executeQuery();
            boolean exist = false;

            int orderNumber = 0;

            double total = 0;

            boolean existe = true;
            do{

                System.out.println("Dime el número del pedido. ");
                int numPedido = sc.nextInt();
                for (;rs.next();){
                    orderNumber = rs.getInt("orderNumber");
                    if (orderNumber == numPedido) {
                        exist = true;
                        if (existe==true){
                            String sql2 = "select * from orders where orderNumber=" + orderNumber + ";";
                            PreparedStatement statement2 = connection.prepareStatement(sql2);
                            ResultSet rs2 = statement2.executeQuery();
                            rs2.next();
                            Date orderDate = rs2.getDate("orderDate");
                            Date requiredDate = rs2.getDate("requiredDate");
                            Date shippedDate = rs2.getDate("shippedDate");
                            String status = rs2.getString("status");
                            String comments = rs2.getString("comments");
                            int customerNumber = rs2.getInt("customerNumber");
                            System.out.println("orderNumber. " + orderNumber);
                            System.out.println("orderDate. " + orderDate);
                            System.out.println("shippedDate. " + shippedDate);
                            System.out.println("requiredDate. " + requiredDate);
                            System.out.println("status. " + status);
                            System.out.println("comentarios. " + comments);
                            System.out.println("customerNumber. " + customerNumber);
                            existe = false;
                        }
                        String productCode = rs.getString("productCode");
                        int quantityOrdered = rs.getInt("quantityOrdered");
                        double priceEach = rs.getDouble("priceEach");
                        int orderLineNumber = rs.getInt("orderLineNumber");
                        PreparedStatement ps2= connection.prepareStatement("select productName from products where productCode='" + productCode + "';");
                        ResultSet rs2 = ps2.executeQuery();
                        rs2.next();
                        String productName = rs2.getString("productName");
                        double precioProducto = quantityOrdered * priceEach;
                        total = total + precioProducto;
                        System.out.println(" ");
                        System.out.println("orderNumber= " + orderNumber);
                        System.out.println("productCode= " + productCode);
                        System.out.println("Nombre del producto= " + productName);
                        System.out.println("quantityOrdered=  " + quantityOrdered);
                        System.out.println("priceEach=  " + priceEach);
                        System.out.println("Precio total del producto=  " + precioProducto);
                        System.out.println("orderLineNumber= " + orderLineNumber);
                    } else if ( orderNumber != numPedido) {
                        break;
                    }
                }
                if (!exist) {
                    System.out.println("Ese número de pedido es erróneo");
                } else {
                    System.out.println(" ");
                    System.out.println("------------------------------------------");
                    System.out.println("| "+"precio total de los  pedidos= " + total +"|");
                    System.out.println("------------------------------------------");
                }

            }while (!exist);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
