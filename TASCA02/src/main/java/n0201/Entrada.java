package n0201;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    //Atributs
    private static Scanner input;

    //Constructor


    //Metodes
    public static byte llegirByte(String missatge) {

        byte byteLlegit = 0;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                byteLlegit = input.nextByte();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Si us plau, introdueix un byte vàlid." + e.getMessage());
            }
            input.nextLine();
        } while (!ok);
        return byteLlegit;
    }

    public static int llegirInt(String missatge) {

        int intLlegit = 0;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                intLlegit = input.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Si us plau, introdueix un int vàlid." + e.getMessage());
            }
            input.nextLine();
        } while (!ok);
        return intLlegit;
    }

    public static float llegirFloat(String missatge) {

        float floatLlegit = 0.0f;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                floatLlegit = input.nextFloat();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Si us plau, introdueix un float vàlid." + e.getMessage());
            }
            input.nextLine();
        } while (!ok);
        return floatLlegit;
    }

    public static double llegirDouble(String missatge) {

        double doubleLlegit = 0.0f;
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                doubleLlegit = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Si us plau, introdueix un double vàlid." + e.getMessage());
            }
            input.nextLine();
        } while (!ok);
        return doubleLlegit;
    }

    public static char llegirChar(String missatge) {

        char charLlegit = ' ';
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                charLlegit = input.next().charAt(0);
                ok = true;
            } catch (Exception e) {
                System.out.println("ERROR: introdueix un char vàlid." + e.getMessage());
            }
            //input.nextLine();
        } while (!ok);
        return charLlegit;
    }

    public static String llegirString(String missatge) {

        String stringLlegit = "";
        boolean ok = false;

        System.out.println(missatge);

        do {
            try {
                stringLlegit = input.nextLine();
                ok = true;
            } catch (Exception e) {
                System.out.println("ERROR: introdueix un string vàlid." + e.getMessage());
            }
            //input.nextLine();
        } while (!ok);
        return stringLlegit;
    }

    public static boolean llegirSiNo(String missatge) {

        boolean booleanLlegit = false;
        boolean ok = false;
        String resposta;

        System.out.println(missatge);

        do {
            try {
                resposta = input.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    booleanLlegit = true;
                    ok = true;
                } else if (resposta.equalsIgnoreCase("n")) {
                    booleanLlegit = false;
                    ok = true;
                } else {
                    System.out.println("Introdueix una resposta vàlida.");
                    ok = false;
                }
            } catch (Exception e) {
                System.out.println("ERROR: introdueix una resposta vàlida." + e.getMessage());
            }
        } while (!ok);
        return booleanLlegit;
    }
}
