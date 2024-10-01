package N0202;

public class GenericMethods {

    public void printArgs(Object... objs) {
        System.out.println("Arg1 generic: " + objs[0]);
        System.out.println("Arg2 generic: " + objs[1]);
        System.out.println("Arg3 generic: " + objs[2]);
    }
}
