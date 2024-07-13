package N0201;

public class Smartphone extends Telefon implements Camera, Rellotge {

    //Atributs

    //Constructor
    public Smartphone(String marca, String model){
        super(marca, model);
    }

    //Getters y Setters

    //Metodes
    public void fotografiar(){
        System.out.println("S'està fent una foto.");
    }

    public void alarma(){
        System.out.println("Està sonant l'alarma.");
    }

    //toString
}
