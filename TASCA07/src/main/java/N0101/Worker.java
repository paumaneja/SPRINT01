package N0101;

public class Worker {
    protected String name;
    protected String lastName;
    protected double hourPrice;

    public Worker(String name, String lastName, double hourPrice) {
        this.name = name;
        this.lastName = lastName;
        this.hourPrice = hourPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }


    public double salaryCalc(int workedHours) {
        return workedHours * this.hourPrice;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hourPrice=" + hourPrice +
                '}';
    }
}
