package N0101;

public class n1exercici1 {

    public static void main(String[] args){


        System.out.println("Creant instàncies:");
        Corda instrument1 = new Corda("violí", 200f);
        instrument1.tocar();
        Vent instrument2 = new Vent("trompeta", 100f);
        instrument2.tocar();
        Percussio instrument3 = new Percussio("bateria", 300f);
        instrument3.tocar();
        //Com veiem al resultat la càrrega de la classe només es produeix una vegada.

    }
}
