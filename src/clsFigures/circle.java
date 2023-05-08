package clsFigures;


public class circle {
    private double radius;
    
    public circle(double radius) {
        this.radius=radius;
    }
    
    public void area(){
        System.out.println("Circle");
        double area=Math.PI*radius*radius;
        System.out.println("Area: "+area);
    }
    
    public void perimeter(){
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter: "+perimeter);
    }
}
