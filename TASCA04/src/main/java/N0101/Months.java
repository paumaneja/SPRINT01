package N0101;

import java.util.ArrayList;

public class Months {

    private static ArrayList<String> listMonths;

    public Months() {
        listMonths = new ArrayList<>();
    }

    public ArrayList<String> addMonths() {
        listMonths.add("Enero");
        listMonths.add("Febrero");
        listMonths.add("Marzo");
        listMonths.add("Abril");
        listMonths.add("Mayo");
        listMonths.add("Junio");
        listMonths.add("Julio");
        //listMonths.add("Agosto");
        listMonths.add("Septiembre");
        listMonths.add("Octubre");
        listMonths.add("Noviembre");
        listMonths.add("Diciembre");
        return listMonths;
    }
}
