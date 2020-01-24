package ej1;

public class Pizza {
    /**
     * Atributos de la clase
     */
    public enum Size{MEDIANA,FAMILIAR}
    private Size mSize;
    private int mNumIngrediente=0;
    private Ingrediente[] mIngredientes;


    /**
     * Constructor de la clase
     * @param s
     */
    public Pizza(Size s){
        this.mSize=s;
        this.mIngredientes=new Ingrediente[3];

    }
    public Pizza(){
        this.mSize=Size.FAMILIAR;
    }
    /**
     * Devuelve el numero de ingredientes
     * @return
     */
    public int getmNumIngrediente() {
        return mNumIngrediente;
    }

    /**
     * Metodo para añadir ingrediente
     * @param ing
     * @return
     */
    public boolean addIngrediente (Ingrediente ing){
        if (this.mNumIngrediente>3){
            return false;
        }
        this.mIngredientes[mNumIngrediente]=ing;
        mNumIngrediente++;
        return true;
    }


    /**
     * Muestra el ingrediente
     */
   public void mostrarIngrediente(){
       System.out.println("La pizza tiene el tamaño "+this.mSize+" y los ingredientes son: ");
       System.out.println("----------------------------------");
       for (int i=0; i<mNumIngrediente;i++){
           System.out.println("|"+this.mIngredientes[i].getmNombre()+" "+"|");
       }
       System.out.println("----------------------------------");
   }



    }

