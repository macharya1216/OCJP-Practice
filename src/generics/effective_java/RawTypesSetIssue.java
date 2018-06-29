package generics.effective_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/*Class demonstrates the example on Pg 113 of
effective Java. Basically the advantage of using
a wildcard vs a raw type for a set

Notice in setInsertsRaw the parameters are raw so
you are able to corrupt the set by mixing integers
and string sets together, however in setInsertWildcard,
the compiler does not allow you to add the two different
sets with wildcard . But the compiler has done its job
preventing you from corrupting the collection's type
invariants.
*/
public class RawTypesSetIssue {

    public static void main(String[] args){
        Set<Integer> set1 = new HashSet();
        set1.addAll(Arrays.asList(1,2,3,4));

        Set<String> set2 = new HashSet();
        set2.addAll(Arrays.asList("Joey","Kraymer","Sienfield"));

        try{
           int num = numElementsInCommon(set1,set2);
           System.out.println(num);
          /* Compiler does not allow you to add two different set types when
            you are using type parameters

           *///System.out.println(setInsertsTyped(set1,set2));

            System.out.println(set1);
           for(Integer str : set1){
               System.out.println(str);
           }

        }catch(Exception e){
            System.out.println(e);
        }
    }

    static boolean setInsertsRaw(Set s1,Set s2){
       return s1.addAll(s2);
    }


  /*  static boolean setInsertsWildCard(Set<?> s1,Set<?> s2){
        return s1.addAll(s2);
    }*/

    static <T> boolean setInsertsTyped(Set<T> s1,Set<T> s2){
        return s1.addAll(s2);
    }
    static int numElementsInCommon(Set s1,Set s2){
        int result = 0;
        for(Object o1: s1)
            if(s2.contains(o1))
                result++;
        return result;
    }
}
