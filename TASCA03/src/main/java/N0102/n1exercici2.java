package N0102;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class n1exercici2 {

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(0);
        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);
        integerList1.add(5);

        List<Integer> integerList2 = new ArrayList<>();

        ListIterator<Integer> listIterator = integerList1.listIterator(integerList1.size());

        while (listIterator.hasPrevious()){
            integerList2.add(listIterator.previous());
        }

        //Mostrem les dades per pantalla
        System.out.println(integerList1);
        System.out.println("-----------");
        System.out.println(integerList2);

    }
}
