package generics.thinking_in_java.generic_varargs;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {

    public static <T> List<T> makeList(T... args){
        List<T> result = new ArrayList<T>();
        for(T item:args)
            result.add(item);
        return result;
    }

    public static void main(String[] args){
        List<String> ls = makeList("A");
        ls = makeList("A","b","C");
        System.out.println(ls);
    }
}
