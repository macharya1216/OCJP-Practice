package generics.thinking_in_java.wildcards;


import java.util.ArrayList;
import java.util.List;

public class WildcardExperiment {


   public static void main (String[] args) {
       List<? extends Number> foo1 = new ArrayList<Number>();  // Number "extends" Number (in this context)
       List<? extends Number> foo2 = new ArrayList<Integer>(); // Integer extends Number
       List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number

       /*While Reading */

       /*You can read a Number because any of the lists that could be assigned to foo3 contain a Number or a subclass of Number.*/
       Number num = foo1.get(0);
        Object ob = foo3.get(0);
       /*You can't read an Integer because foo3 could be pointing at a List<Double>*/
       //Integer in = foo1.get(0);

        /*While writing*/
      /* You can't add an Integer because foo3 could be pointing at a List<Double>.
       You can't add a Double because foo3 could be pointing at a List<Integer>.
       You can't add a Number because foo3 could be pointing at a List<Integer>*/

       //foo1.add(1);
      // foo2.add(new Integer(0));
       foo2.add(null);
      // foo2.add(new Object());

       List<? super Integer> foo4 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
       List<? super Integer> foo5 = new ArrayList<Number>();   // Number is a superclass of Integer
       List<? super Integer> foo6 = new ArrayList<Object>();   // Object is a superclass of Integer

       /*While Reading*/

       /*You aren't guaranteed an Integer because foo3 could be pointing at a List<Number> or List<Object>*/
       //Integer in = foo4.get(0);

       /*You aren't guaranteed a Number because foo3 could be pointing at a List<Object>.*/
       //Number number = foo5.get(0);

       /*The only guarantee is that you will get an instance of an Object or subclass of Object (but you don't know what subclass).*/
       Object obj = foo5.get(0);

       /*While Writing*/
       /*
       You can add an Integer because an Integer is allowed in any of above lists.
               You can add an instance of a subclass of Integer because an instance of a subclass of Integer is allowed in any of the above lists.
*/
       foo4.add(new Integer(0));
       /*You can't add a Double because foo3 could be pointing at an ArrayList<Integer>*/
      // foo4.add(new Double(0));


   }
}
