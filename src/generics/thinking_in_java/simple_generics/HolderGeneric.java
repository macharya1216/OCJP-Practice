package generics.thinking_in_java.simple_generics;
interface Smooth{}
class MyCar extends Automobile implements Smooth{}
public class HolderGeneric<T> {

    private T a;
    public HolderGeneric(T t){
        this.a = a;
    }
    public void set(T a){
        this.a = a;
    }
    public T get(){
        return a;
    }
    public static void main(String[] args){
        HolderGeneric<Automobile> h3 = new HolderGeneric<>(new Automobile());
        Automobile a = h3.get();
        h3.set(new MyCar());
        HolderGeneric<Smooth> h4 = new HolderGeneric<>(new MyCar());


    }

}
