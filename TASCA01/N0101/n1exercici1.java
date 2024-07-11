package N0101;

public class n1exercici1 {

    public static void main(String[] args){

        System.out.println("Inicialització per instància:");
        Vent instrument1 = new Vent("trompeta", 100f);
        Corda instrument2 = new Corda("violí", 200f);
        Percussio instrument3 = new Percussio("bateria", 300f);

        System.out.println(instrument1);
        System.out.println(instrument2);
        System.out.println(instrument3);




    }
}
