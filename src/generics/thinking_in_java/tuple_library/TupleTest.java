package generics.thinking_in_java.tuple_library;

import static generics.thinking_in_java.tuple_library.Tuple.tuple;

class Amphibian{}
class Vehicle{}
public class TupleTest {

    static TwoTuple<String,Integer> f(){
        return tuple("hi",9);
    }
    static ThreeTuple<Amphibian,String,Integer> g(){
        return tuple(new Amphibian(),"ni",0);
    }


    public static void main(String[] args){
        TwoTuple<String,Integer> two = f();
        ThreeTuple<Amphibian,String,Integer> three = g();
        System.out.println(two);
        System.out.println(three);
    }
}
