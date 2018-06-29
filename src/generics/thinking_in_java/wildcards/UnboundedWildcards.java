package generics.thinking_in_java.wildcards;

import java.util.ArrayList;
import java.util.List;

public class  UnboundedWildcards<T> {

    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;
    List<T> list4;
    static void assign1(List list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign2(List<?> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign3(List<? extends Object> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args){
        assign1(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());
    }

    void assign4(List<T> list) {
        list1 = list;
    }
}
