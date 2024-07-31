package N0102;


public class OnsiteWorker extends Worker {

    protected static int fuel;

    public OnsiteWorker(String name, String lastName, double hourPrice){
        super(name, lastName, hourPrice);
    }

    @Override
    public double salaryCalc(int workedHours) {
        return super.salaryCalc(workedHours) + fuel;
    }

    @Deprecated
    public void deprecatedMethodOnsite(){
        System.out.println("This is an obsolet method of the OnsiteWorker class.");
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
