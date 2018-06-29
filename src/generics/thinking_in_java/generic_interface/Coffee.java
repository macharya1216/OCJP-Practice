package generics.thinking_in_java.generic_interface;

public class Coffee {

    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }
}
