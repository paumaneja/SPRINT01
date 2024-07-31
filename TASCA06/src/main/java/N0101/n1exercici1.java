package N0101;

public class n1exercici1 {

    public static void main(String[] args) {

        NoGenericMethods obj1 = new NoGenericMethods("Test String at position 1", 10, 5.3);
        System.out.println("Obj1: " + obj1.getObj1());
        System.out.println("Obj2: " + obj1.getObj2());
        System.out.println("Obj3: " + obj1.getObj3());

        NoGenericMethods obj2 = new NoGenericMethods(10, "Test String at position 2", 2.3);
        System.out.println("Obj1: " + obj2.getObj1());
        System.out.println("Obj2: " + obj2.getObj2());
        System.out.println("Obj3: " + obj2.getObj3());

    }
}
