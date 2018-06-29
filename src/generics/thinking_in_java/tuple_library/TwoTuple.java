package generics.thinking_in_java.tuple_library;

public class TwoTuple<A,B> {

    public final A first;
    public final B second;

    public TwoTuple(A a,B b){
        first = a;
        second = b;
    }

    @Override
    public String toString(){
        return "("+first +","+second+")";
    }
}
