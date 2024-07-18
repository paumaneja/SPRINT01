package n0101;

import java.util.ArrayList;

public class Venda {

    //Atributs
    private ArrayList<Producte> llistaProductes;
    private int preuTotalVenda;

    //Constructor
    public Venda(ArrayList<Producte> llistaProductes){
        this.llistaProductes = llistaProductes;
        this.preuTotalVenda = 0;
    }

    //Getters y Setters
    public ArrayList<Producte> getLlistaProductes() {
        return llistaProductes;
    }

    public void setLlistaProductes(ArrayList<Producte> llistaProductes) {
        this.llistaProductes = llistaProductes;
    }

    public int getPreuTotalVenda() {
        return preuTotalVenda;
    }

    public void setPreuTotalVenda(int preuTotalVenda) {
        this.preuTotalVenda = preuTotalVenda;
    }

    //Metodes
    public int calcularTotal() throws VendaBuidaException{

        int costTotal;

        if (llistaProductes.isEmpty()){
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes.");
        } else {
            for (int i = 0; i < llistaProductes.size(); i++){
                this.preuTotalVenda += llistaProductes.get(i).getPreu();
            }
        }
        costTotal = this.preuTotalVenda;
        return costTotal;

    }

    //toString
    @Override
    public String toString() {
        return "Venda{" + "llistaProductes=" + llistaProductes + ", preuTotalVenda=" + preuTotalVenda + '}';
    }
}
