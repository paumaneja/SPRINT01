package N0101;

public class Vent extends Instrument {

    //Atributs

    //Constructor
    public Vent(String nom, double preu){
        super(nom, preu);
    }

    //Metodes
    public void tocar(){
        System.out.println("Està sonant un instrument de vent.");
    }
}
