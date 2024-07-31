package N0102;


public class OnlineWorker extends Worker {

    protected static final double INTERNET = 50.2;

    public OnlineWorker(String name, String lastName, double hourPrice){
        super(name, lastName, hourPrice);
    }

    @Override
    public double salaryCalc(int workedHours) {
        return super.salaryCalc(workedHours) + INTERNET;
    }

    @Deprecated
    public void deprecatedMethodOnline(){
        System.out.println("This is an obsolet method of the OnlineWorker class.");
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

