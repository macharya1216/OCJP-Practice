package generics.thinking_in_java.mystery_of_erasure;

import java.util.*;

class Frob{}
class Fnorkle{}
class Quark<Q> {}
class Particle<POSITION,MOMENTUM>{}
public class LostInformation {
    public static void main(String[] args){
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob,Fnorkle> map = new HashMap<Frob,Fnorkle>();
        Particle<Long,Double> p = new Particle<Long,Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
    }
}

/*Prints out
[E]
[K, V]
[POSITION, MOMENTUM]*/
