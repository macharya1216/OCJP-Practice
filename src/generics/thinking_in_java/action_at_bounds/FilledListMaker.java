package generics.thinking_in_java.action_at_bounds;

import java.util.ArrayList;
import java.util.List;

public class FilledListMaker<T> {

    List<T> create(T t, int n){
        List<T> result = new ArrayList<T>();
        for(int i = 0; i < n;i++)
            result.add(t);
        return result;
    }

    public static void main(String[] args){
        FilledListMaker<String> stringMaker = new FilledListMaker<String>();
        List<String> list = stringMaker.create("Hello",4);
    }
}