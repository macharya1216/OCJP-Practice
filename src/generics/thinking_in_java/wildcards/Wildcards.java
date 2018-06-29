package generics.thinking_in_java.wildcards;

public class Wildcards {

    static void rawArgs(Holder holder, Object arg){
        holder.set(arg); // warning unchecked call
        holder.set(new Wildcards()); // warning unchecked call

        // T t = holder.get(); // Can't do this, don't have any T

        Object obj = holder.get();
    }

    static void unboundedArg(Holder<?> holder, Object arg){
        // holder.set(arg); // compiler error
        // holder.set(new Wildcards()); // compiler error
    }

    static <T> T exact1(Holder<T> holder){
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder,T arg){
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder,T arg){
        //holder.set(arg); // error
        T t = holder.get();
        return t;
    }

    static<T> void wildSupertype(Holder<? super T> holder, T arg){
        holder.set(arg);
       // T t = holder.get(); error
        Object obj = holder.get(); // OK but information is lost
    }

    public static void main(String[] args){
        Holder raw = new Holder<Long>();
        raw = new Holder();

        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<>();
        Holder<? super Long> superBounded = new Holder<>();
        Long lng = 1l;

        rawArgs(raw,lng);
        rawArgs(qualified,lng);
        rawArgs(unbounded,lng);
        rawArgs(bounded,lng);

        unboundedArg(raw,lng);
        unboundedArg(qualified,lng);
        unboundedArg(unbounded,lng);
        unboundedArg(bounded,lng);

        Object r1 = exact1(raw);
        Long r2 = exact1(qualified);
      //  Long r3 = exact1(unbounded); Compiler error
        Long r4 = exact1(bounded);

        Long r5 = exact2(raw,lng); // warning
        Long r6 = exact2(qualified,lng);

        //Long r7 exact2(unbounded,lng); // Compiler error
        // Long r8 = exact2(bounded,lng); // Compiler error
       //  Long r9 = exact2(superBounded,lng); // Compiler error

        Long r10 = wildSubtype(raw,lng); // warning
        Long r11 = wildSubtype(qualified,lng);
        Object r12 = wildSubtype(unbounded,lng);
        Long r13 = wildSubtype(bounded,lng);



        wildSupertype(raw,lng); // warning
        wildSupertype(qualified,lng);
       // wildSupertype(unbounded,lng); // error
        // wildSupertype(bounded,lng);  // error



    }

}
