package N0102;

public class GenericMethods {


    public <T, V, U> void printArgs(T arg1, V arg2, U arg3) {
        System.out.println("Arg1 generic: " + arg1);
        System.out.println("Arg2 generic: " + arg2);
        System.out.println("Arg3 generic: " + arg3);
    }
}
