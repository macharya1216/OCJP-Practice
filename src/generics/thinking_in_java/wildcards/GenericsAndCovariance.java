package generics.thinking_in_java.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsAndCovariance {

    public static void main(String[] args){
        List<? extends Fruit> flist = new ArrayList<Apple>();
       // flist.add(new Apple());
        //flist.add(new Fruit());
        //flist.add(new Object());

        List<? extends Fruit> flist1 = Arrays.asList(new Apple());
        Apple a = (Apple) flist1.get(0);
        Fruit f = flist.get(0);
        System.out.println(f);
        System.out.println(flist1.contains(new Apple()));
       System.out.println(flist1.indexOf(new Apple()));
        System.out.println(flist1);
    }
}
