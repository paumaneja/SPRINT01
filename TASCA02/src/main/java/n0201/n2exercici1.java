package n0201;

public class n2exercici1 {

    public static void main(String[] args) {

        byte byteLlegit = Entrada.llegirByte("Introdueix un byte (número sencer):");
        System.out.println(byteLlegit);
        int intLlegit = Entrada.llegirInt("Introdueix un int (número sencer):");
        System.out.println(intLlegit);
        float floatLlegit = Entrada.llegirFloat("Introdueix un float (número amb màxim 7 decimals separats per una coma:");
        System.out.println(floatLlegit);
        double doubleLlegit = Entrada.llegirDouble("Introdueix un double (número amb màxim 15 decimals separats per una coma:");
        System.out.println(doubleLlegit);
        char charLlegit = Entrada.llegirChar("Introdueix un char (un únic caràcter):");
        System.out.println(charLlegit);
        String stringLlegit = Entrada.llegirString("Introdueix un string (més d'un caràcter)");
        System.out.println(stringLlegit);
        boolean booleanLlegit = Entrada.llegirSiNo("Introdueix Si o No segons aquest format (Si = s / No = n)");
        System.out.println(booleanLlegit);

    }


}
