package N0105;

import java.io.Serializable;

public class SerializableClass implements Serializable {

    private String atribute1;
    private int atribute2;

    public SerializableClass(String atribute1, int atribute2){
        this.atribute1 = atribute1;
        this.atribute2 = atribute2;
    }

    public String getAtribute1() {
        return atribute1;
    }

    public void setAtribute1(String atribute1) {
        this.atribute1 = atribute1;
    }

    public int getAtribute2() {
        return atribute2;
    }

    public void setAtribute2(int atribute2) {
        this.atribute2 = atribute2;
    }

    @Override
    public String toString() {
        return "SerializableClass{" +
                "atribute1='" + atribute1 + '\'' +
                ", atribute2=" + atribute2 +
                '}';
    }
}
