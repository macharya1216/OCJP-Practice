package generics.thinking_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Following class demonstrates
how erasure will remove the type of
the array at runtime. Even though
compiler checks that the ArrayList is
of type String, at runtime the type is
just a raw ArrayList*/

public class A {

    public static void main(String[] args){
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1.getSimpleName()); // Out puts that it's an ArrayList
        System.out.println(c1.getSimpleName());
        arrayExperiment();

       }

    private static <T> void arrayExperiment(){
       T[] array = (T[]) new Object[1];
       array[0] = (T)"dooby";
       array[0] = (T)"dawn";
       Arrays.toString(array); // Out puts nothing



    }
}
