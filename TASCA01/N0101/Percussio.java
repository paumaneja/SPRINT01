package N0101;

public class Percussio extends Instrument{

    //Atriibuts

    //Constructor
    public Percussio(String nom, double preu){
        super(nom, preu);
    }

    //Metodes
    public void tocar(){
        System.out.println("Està sonant uns instrument de percussió.");
    }
}
