package generics.thinking_in_java.simple_generics;

import java.util.ArrayList;
import java.util.List;

class Automobile{};

/*Class shows a a generic holder can be used
* Object stores any kind of values i.e Automobile, String,
* Integer etc and while retrieving the object, programmer
* will have to cast it to the specific type. */
public class HolderObject {

    private Object a;
    public HolderObject(Object a){
        this.a = a;
    }
    public void set(Object a){
        this.a = a;
    }
    public Object get(){
        return a;
    }

    public static void main(String[] args){
        HolderObject h = new HolderObject(new Automobile());
        Automobile a = (Automobile)h.get();
        h.set("String");
        String s = (String) h.get();
        h.set(1);
        int x = (Integer)h.get();
        System.out.println(x);
    }
}
