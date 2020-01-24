package ej1;

import java.util.Arrays;

public class mainpizza {
    public static void main(String[] args) {
        Pedido p2= new Pedido();
        Pizza p= new Pizza(Pizza.Size.FAMILIAR);
        Ingrediente i1= new Ingrediente("jamón", (double)60);
        Ingrediente i2= new Ingrediente("Queso",(double)120);
        Ingrediente i3=new Ingrediente("Salami",(double)90);

        System.out.println(p.getmNumIngrediente());

        p.addIngrediente(i1);
        p.addIngrediente(i2);
        p.addIngrediente(i3);

        p.mostrarIngrediente();
        p2.mostrarPedido();
    }
}
