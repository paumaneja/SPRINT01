package N0101;

public class Month {

    private String name;

    //Constructor
    public Month(String name){
        this.name = name;
    }

    //Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Metodes


    //toString

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
