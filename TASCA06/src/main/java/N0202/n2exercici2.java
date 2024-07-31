package N0202;


public class n2exercici2 {


    public static void main(String[] args) {

        Person person = new Person("Pau", "Maneja", 45);
        String text = "Test text";
        int num = 10;

        GenericMethods gm = new GenericMethods();
        System.out.println("Test1: ");
        gm.printArgs(person, text, num);
        System.out.println("Test2: ");
        gm.printArgs(text, num, person);
        System.out.println("Test3: ");
        gm.printArgs(text, text, text);
    }
}
