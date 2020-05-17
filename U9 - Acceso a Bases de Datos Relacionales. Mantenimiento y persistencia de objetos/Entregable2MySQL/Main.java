package Entregable2MySQL;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataConnection dc=new DataConnection();
        ArrayList<Employee> employees=new ArrayList<>();
        ArrayList<Office> offices=new ArrayList<>();
        ADClassicModels acm=new ADClassicModels();
        offices= (ArrayList<Office>) acm.getOffice();
        employees= (ArrayList<Employee>) acm.getEmployees();
        System.out.println('\n'+"-------------------------------------------------------------------------------"+'\n');
        System.out.println(employees);
        System.out.println('\n'+"-------------------------------------------------------------------------------"+'\n');
        System.out.println(offices);
        System.out.println('\n'+"-------------------------------------------------------------------------------"+'\n');

        dc.close();
    }
}
