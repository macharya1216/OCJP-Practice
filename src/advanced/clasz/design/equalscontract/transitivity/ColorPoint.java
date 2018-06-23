package advanced.clasz.design.equalscontract.transitivity;

import java.awt.*;

/*Class demonstrates how transitvity fails when using inheritance
* Even though the ColorPoint method checks for ColorPoint and Point
* Type, the problem is that while comparing these two types, the result
* is not consistent for logically equivalent or unequivalent for Point and ColorPoint
 * types*/

enum COLOR{RED,BLUE}
public class ColorPoint extends Point {

    private final COLOR color;
    public ColorPoint(int x, int y, COLOR color){
        super(x,y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Point))
            return false;
        // if o is a normal Point, do a color-blind comparision
        if(!(o instanceof ColorPoint))
            return o.equals(this);

        // if o is a colorPoint; do a full comparision
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    public static void main(String[] args){
        ColorPoint p1 = new ColorPoint(1,2,COLOR.BLUE);
        Point p2 = new Point(1,2);
        ColorPoint p3 = new ColorPoint(1,2,COLOR.RED);

        assert (!p1.equals(p3)); // BREAKS Transitivity , even though Point and Color Point are equal because it does a Point comparision, Color Point comparision returns false.
        assert (p1.equals(p2));
        assert (p3.equals(p2));
    }


}
