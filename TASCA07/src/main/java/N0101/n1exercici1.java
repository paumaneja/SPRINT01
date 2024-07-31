package N0101;

public class n1exercici1 {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Pau", "Maneja", 20);
        OnlineWorker worker2 = new OnlineWorker("Marc", "Maneja", 25);
        OnsiteWorker worker3 = new OnsiteWorker("Paco", "Meralgo", 30);

        int workedHours = 100;

        System.out.println("The salary of " + worker1.getName() + " " + worker1.getLastName() + ": " + worker1.salaryCalc(workedHours));
        System.out.println("The salary of " + worker2.getName() + " " + worker2.getLastName() + ": " + worker2.salaryCalc(workedHours));
        System.out.println("The salary of " + worker3.getName() + " " + worker3.getLastName() + ": " + worker3.salaryCalc(workedHours));

    }
}
