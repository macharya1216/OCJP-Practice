package functional_programming.animal_kingdom;

public class Duck extends Animal {
    Duck(String name){
        super(name);
    }
    void quack(){
        System.out.println(name +" is quacking");
    }


    public static void main(String[] arg){
        actingFactory((a,d) ->  d.quack(),new Animal("snoop"),new Duck("doob"));;

    }

    static void actingFactory(DoAction doAction,Animal a, Duck d){
        doAction.act(a,d);
    }
}
