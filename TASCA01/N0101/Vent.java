package N0101;

public class Vent extends Instrument {

    //Atributs

    //Constructor
    public Vent(String nom, double preu){
        super(nom, preu);
        System.out.println("Constructor de la classe Vent.");
    }

    //Getters y Setters

    //Metodes
    public void tocar(){
        System.out.println("Està sonant un instrument de vent.");
    }

    //toString
}
