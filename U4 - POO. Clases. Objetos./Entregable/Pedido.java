package ej1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pedido {
    /**
     * Atributos de pedidos
     */
    private Pizza mPizza;
    private Calendar mFecha;

    /**
     * Constructor de pedidos
     * @param pizza
     */
    public Pedido(Pizza pizza) {
        this.mPizza = pizza;
        this.mFecha=Calendar.getInstance();
    }

    /**
     * Constructor para la pizza por defecto
     */
    public Pedido(){
        this.mPizza=new Pizza(Pizza.Size.FAMILIAR);
        Ingrediente i1= new Ingrediente("Jamon",(double)120);
        Ingrediente i2= new Ingrediente("Queso",(double) 90);
        this.mPizza.addIngrediente(i1);
        this.mPizza.addIngrediente(i2);
    }
    public void mostrarPedido(){
        DateFormat dateFormat= new SimpleDateFormat("DD/MM/YYYY HH:MM:SS");
        System.out.println("Entrega: "+dateFormat.format(this.mFecha));
    }

}
