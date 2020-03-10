package Actividad18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,Elemento> miCarrito= new HashMap<>();
        Scanner sc= new Scanner(System.in);
        String texto;

        try {
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream("cantidad.bin"));
            while (true){
                Elemento e=(Elemento) ois.readObject();
                miCarrito.put(e.getNombre(),e);

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    }

