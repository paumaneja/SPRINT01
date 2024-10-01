package N0101;

public class OnsiteWorker extends Worker {

    protected static int fuel = 100;

    public OnsiteWorker(String name, String lastName, double hourPrice) {
        super(name, lastName, hourPrice);
    }

    @Override
    public double salaryCalc(int workedHours) {
        return super.salaryCalc(workedHours) + fuel;
    }

    @Override
    public String toString() {
        return "OnsiteWorker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hourPrice=" + hourPrice +
                '}';
    }
}
