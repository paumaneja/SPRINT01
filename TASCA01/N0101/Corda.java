package N0101;

public class Corda extends Instrument {

    //Atributs

    //Constructor
    public Corda(String nom, double preu) {
        super(nom, preu);
        System.out.println("Constructor de la classe Corda");
    }

    //Getters y Setters

    //Metodes
    @Override
    public void tocar() {
        System.out.println("Està sonant uns instrument de corda.");
    }

    //toString
}
