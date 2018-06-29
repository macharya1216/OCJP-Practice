package generics.thinking_in_java.wildcards;

class Fruit{}
class Apple extends Fruit{}
class Johathan extends Apple{}
class Orange extends Fruit{}
public class CovariantArrays {

    public static void main(String[] args){
        Fruit[] fruit = new Apple[10]; // you can assign an array of derived type to an array of reference of the base type
        fruit[0] = new Apple();
        fruit[1] = new Johathan();

        try{
            fruit[0] = new Fruit();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            fruit[0] = new Orange();
        }catch(Exception e){
            System.out.println(e);
        }

    }

}


