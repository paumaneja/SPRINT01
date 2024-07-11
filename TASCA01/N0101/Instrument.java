package N0101;

public abstract class Instrument {

    protected String nom;
    protected double preu;

    //Constructor
    public Instrument (String nom, double preu){
        this.nom = nom;
        this.preu = preu;
    }

    {
        System.out.println("Bloc d'inicialització");
    }

    //Getters y Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    //Metodes
    public abstract void tocar();

    //toString

    @Override
    public String toString() {
        return "Instrument{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                '}';
    }

    static{
        System.out.println("Bloc estàtic");
    }
}
