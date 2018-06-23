package functional_programming.animal_kingdom;

public class Animal {

     String name;

    Animal(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
