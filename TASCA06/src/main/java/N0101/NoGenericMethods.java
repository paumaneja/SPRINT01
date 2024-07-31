package N0101;

public class NoGenericMethods {

    private Object obj1;
    private Object obj2;
    private Object obj3;

    public NoGenericMethods(Object obj1, Object obj2, Object obj3){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public Object getObj1() {
        return obj1;
    }

    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    public Object getObj2() {
        return obj2;
    }

    public void setObj2(Object obj2) {
        this.obj2 = obj2;
    }

    public Object getObj3() {
        return obj3;
    }

    public void setObj3(Object obj3) {
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                '}';
    }
}
