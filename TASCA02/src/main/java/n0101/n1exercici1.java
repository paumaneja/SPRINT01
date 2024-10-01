package n0101;

import java.util.ArrayList;

public class n1exercici1 {

    public static void main(String[] args) {

        ArrayList<Producte> llistaProductes1 = new ArrayList<>();
        ArrayList<Producte> llistaProductes2 = new ArrayList<>();

        llistaProductes1.add(new Producte("llet", 10));
        llistaProductes1.add(new Producte("aigua", 20));
        llistaProductes1.add(new Producte("ceba", 30));

        Venda venda1 = new Venda(llistaProductes1);
        Venda venda2 = new Venda(llistaProductes2);


        try {
            int costTotal = venda1.calcularTotal();
            System.out.println("La venda1 té un cost total de: " + costTotal + " euros.");

        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Repetim el procediment però amb una venda buida:");

        try {
            int costTotal = venda2.calcularTotal();
            System.out.println("La venda2 té un cost total de: " + costTotal + " euros.");

        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSegona part exercici (ArrayIndexOutOfBoundsException).");

        int[] arrayTest = new int[5];

        try {
            arrayTest[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR. S'ha sobrepassat el tamany de l'array.");
        }

    }
}
