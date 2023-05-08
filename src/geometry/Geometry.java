package geometry;

import clsFigures.circle;
import clsFigures.rect;
import clsFigures.square;

public class Geometry {

    public static void main(String[] args) {
        circle circle1=new circle(1);
        rect rect1= new rect(2,2);
        square square1=new square(4);
        
        circle1.area();
        circle1.perimeter();
        
        rect1.area();
        rect1.perimeter();
        
        square1.area();
        square1.perimeter();
    }
    
}
