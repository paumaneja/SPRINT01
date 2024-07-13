package N0201;

public class Telefon {

    //Atributs
    protected String marca;
    protected String model;

    //Constructor
    public Telefon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }

    //Getters y Setters

    //Metodes
    public void trucar(String numero){
        System.out.println("S'està trucant al número: " + numero);
    }

    //toString
}
