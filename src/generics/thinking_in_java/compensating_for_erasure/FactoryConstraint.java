package generics.thinking_in_java.compensating_for_erasure;
interface Factory<T>
{
    T create();
}

class Foo2<T>{
     T x;
    public <F extends Factory<T>> Foo2(F factory){
        x = factory.create();
    }
}

class IntegerFactory implements Factory<Integer>{
    public Integer create(){
        return new Integer(0);
    }
}
class Widget{
    public static class Factory1 implements Factory<Widget>{
        public Widget create(){
            return new Widget();
        }
    }
}
public class FactoryConstraint {

    public static void main(String[] args){
        Foo2<Integer> Integer = new Foo2<Integer>(new IntegerFactory());
        System.out.println(Integer.x);
        System.out.println(new Foo2<Widget>(new Widget.Factory1()));
    }


}
