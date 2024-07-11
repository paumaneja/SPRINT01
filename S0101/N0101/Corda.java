package S0101.N0101;

public class Corda extends Instrument{

    //Atributs

    //Constructor
    public Corda(String nom, double preu){
        super(nom, preu);
    }

    //Metodes
    public void tocar(){
        System.out.println("Està sonant uns instrument de corda.");
    }
}
