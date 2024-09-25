package N0101;

public class Percussio extends Instrument{

    //Atributs

    //Constructor
    public Percussio(String nom, double preu){
        super(nom, preu);
        System.out.println("Constructor de la classe Percussió.");
    }

    //Getters y Setters

    //Metodes
    @Override
    public void tocar(){
        System.out.println("Està sonant uns instrument de percussió.");
    }

    //toString
}
