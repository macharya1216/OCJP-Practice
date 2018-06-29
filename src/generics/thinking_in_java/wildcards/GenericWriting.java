package generics.thinking_in_java.wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

    static<T> void writeExact(List<? super T> list, T item){
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();

    static void f1(){

    writeExact(apples,new Johathan());
    writeExact(fruit,new Orange());
    }


}
