package generics;

import java.util.Arrays;
import java.util.List;

public class Box<T> {

    public static <T> void ship(T t){
        System.out.println("Preparing to ship "+t);
        //returnCall(t);
    }

    public static void main(String args[]){
        Box.<String>ship("");
        Box.<List<String>>ship(Arrays.asList("Dooby","dada","Dum Dum"));
        Box.<StringBuilder>ship(new StringBuilder("Hello"));
        Box.<int []>ship(new int[]{1,1});
    }

}
