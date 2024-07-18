package N0101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class n1exercici1 {

    public static void main(String[] args) {

        ArrayList<Month> listMonths = new ArrayList<>();

        listMonths.add(new Month("Enero"));
        listMonths.add(new Month("Febrero"));
        listMonths.add(new Month("Marzo"));
        listMonths.add(new Month("Abril"));
        listMonths.add(new Month("Mayo"));
        listMonths.add(new Month("Junio"));
        listMonths.add(new Month("Julio"));
        listMonths.add(new Month("Septiembre"));
        listMonths.add(new Month("Octubre"));
        listMonths.add(new Month("Noviembre"));
        listMonths.add(new Month("Diciembre"));

        //Recorremos el arraylist, añadimos mes, volvemos a recorrer el arraylist
        for (Month month : listMonths){
            System.out.println(month.getName());
        }

        System.out.println("-----------");
        Month agosto = new Month("Agosto");
        listMonths.add(7, agosto);

        Iterator<Month> it = listMonths.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
        System.out.println("-----------");

        //Convertimos en un HashSet y añadimos un elemento repetido
        Set<Month> monthSet = new HashSet<>(listMonths);
        monthSet.add(agosto);

        //Recorremos con un for. Sigue habiendo 12 meses y los muestra desordenados
        for (Month month : monthSet){
            System.out.println(month.getName());
        }
        System.out.println("-----------");

        //Recorremos con un Iterador
        Iterator<Month> it2 = monthSet.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next().getName());
        }
        System.out.println("-----------");

    }
}
