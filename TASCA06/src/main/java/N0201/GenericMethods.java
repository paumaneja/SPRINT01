package N0201;

public class GenericMethods {


    public <T, V> void printArgs(T arg1, V arg2, int num){
        System.out.println("Arg1 generic: " + arg1);
        System.out.println("Arg2 generic: " + arg2);
        System.out.println("Arg3 no generic: " + num);
    }
}
