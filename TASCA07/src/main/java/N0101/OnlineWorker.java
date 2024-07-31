package N0101;

public class OnlineWorker extends Worker{

    protected static final double INTERNET = 50.2;

    public OnlineWorker(String name, String lastName, double hourPrice){
        super(name, lastName, hourPrice);
    }

    @Override
    public double salaryCalc(int workedHours) {
        return super.salaryCalc(workedHours) + INTERNET;
    }

    @Override
    public String toString() {
        return "OnlineWorker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hourPrice=" + hourPrice +
                '}';
    }
}
