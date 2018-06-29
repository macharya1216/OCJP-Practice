package generics.thinking_in_java.action_at_bounds;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Even though kind is stored as Class<T>
* erasure means that it's actually just
* being stored as a Class, with no parameters.
* So when you do something with it, as in
* creating an Array, Array.newInstance(), doesn't
* actually have the type information that's
* implied in kind so it can't produce the
* specific result which must therefore be cast*/

public class ArrayMaker<T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind){
        this.kind = kind;
    }
    T[] create(int size){
        return (T[])Array.newInstance(kind,size);
    }

    public static void main(String[] args){
        ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(9);
        for(int i=0; i < stringArray.length; i++)
            stringArray[i] = String.valueOf(i);
        System.out.println(Arrays.toString(stringArray));
    }
}
