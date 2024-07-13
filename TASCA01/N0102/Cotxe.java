package N0102;

public class Cotxe {

    //Atributs
    protected static final String MARCA = "Hyundai";
    protected static String model;
    protected final int POTENCIA;

    //Constructor
    public Cotxe(String model, int POTENCIA){
        Cotxe.model = model;
        this.POTENCIA = POTENCIA;
    }

    //Getter y Setters

    //Metode estàtic
    public static void frenar(){
        System.out.println("El vehicle està frenant.");
    }

    //Metode no estàtic
    public void accelerar(){
        System.out.println("El vehicle està accelerant.");
    }

    //toString
}
