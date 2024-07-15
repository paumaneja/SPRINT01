package n0101;

public class Producte {

    //Atributs
    private String nom;
    private int preu;

    //Constructor
    public Producte(String nom, int preu){
        this.nom = nom;
        this.preu = preu;
    }

    //Getters y Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    //toString

    @Override
    public String toString() {
        return "Producte{" + "nom='" + nom + '\'' + ", preu=" + preu + '}';
    }
}
