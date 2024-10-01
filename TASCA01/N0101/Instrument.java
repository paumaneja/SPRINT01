package N0101;

public abstract class Instrument {

    //Atributs
    protected String nom;
    protected double preu;

    //Constructor
    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
        System.out.println("Constructor de la classe Instrument.");
    }

    //Bloc dinàmic
    {
        System.out.println("Bloc d'inicialització de la classe Instrument. Cada cop que s'accedeix a la classe.");
    }

    //Getters y Setters

    //Metodes
    public abstract void tocar();

    //toString

    //Bloc estàtic
    static {
        System.out.println("S'ha carregat la classe Instrument. Primera i única vegada.");
    }
}
