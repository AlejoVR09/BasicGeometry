package clsFigures;

public class rect {
    private float base, height;
    public rect(float base,float height) {
        this.base=base;
        this.height=height;
    }
    
    public void area(){
        System.out.println("Rectangule");
        float area=base*height;
        System.out.println("Area: "+area);
    }
    
        public void perimeter(){
        float perimeter=2*base+2*height;
        System.out.println("Perimeter: "+perimeter);
    }
}
