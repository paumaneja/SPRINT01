package N0102;


public class Dni {

    private static final String chars = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateLetterDni(int dniNUmber) {

        int index = dniNUmber % 23;
        return chars.charAt(index);
    }
}
