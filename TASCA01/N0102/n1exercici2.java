package N0102;

public class n1exercici2 {

    public static void main(String[] args) {

        //Instanciem 2 cotxes
        Cotxe cotxe1 = new Cotxe("i20", 100);
        Cotxe cotxe2 = new Cotxe("i30", 120);

        //Mostrem atributs
        System.out.println("La marca del cotxe1: " + Cotxe.MARCA);
        System.out.println("El model del cotxe1: " + Cotxe.model);
        System.out.println("La potència del cotxe1: " + cotxe1.POTENCIA);
        System.out.println("La marca del cotxe2: " + Cotxe.MARCA);
        System.out.println("El model del cotxe2: " + Cotxe.model);
        System.out.println("La potència del cotxe2: " + cotxe2.POTENCIA);

        //Cridem metodes
        Cotxe.frenar();
        cotxe1.accelerar();
        cotxe2.accelerar();

        //Canviem atribut model
        Cotxe.model = "Tucson";
        System.out.println("El model del cotxe1: " + Cotxe.model);
        System.out.println("El model del cotxe2: " + Cotxe.model);


    }
}
