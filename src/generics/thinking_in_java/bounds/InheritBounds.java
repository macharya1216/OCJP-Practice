package generics.thinking_in_java.bounds;

interface HasColor{java.awt.Color getColor();}
class Dimension {
    public int x,y,z;
}
interface Weight {
    int weight();
}
class HoldItem<T>{
    T item;
    HoldItem(T item){
        this.item = item;
    }
}

class Colored2<T extends HasColor> extends HoldItem<T>{
    Colored2(T item){
        super(item);
    }
    java.awt.Color color() {
        return item.getColor();
    }
}

class ColoredDimensions<T extends Dimension & HasColor & Weight> extends Colored2<T>{
    ColoredDimensions(T item){
        super(item);
    }

    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
}
class Solid<T extends Dimension & HasColor & Weight> extends ColoredDimensions<T>{

    Solid(T item){
        super(item);
    }
    int weight() {
        return item.weight();
    }

}
class Bounded extends Dimension implements HasColor,Weight{
    public java.awt.Color getColor() {
        return null;
    }
    public int weight (){
        return 0;
    }
}

public class InheritBounds {

    public static void main(String[] args){
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        System.out.println(solid.getY());
        System.out.println(solid.weight());
    }
}
