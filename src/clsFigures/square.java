/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clsFigures;

/**
 *
 * @author disenoydesarrollo
 */
public class square {
    private float side;
    public square(float side) {
        this.side=side;
    }
    
    public void area(){
        System.out.println("Square");
        float area=side*side;
        System.out.println("Area: "+area);
    }
    
    public void perimeter(){
        float perimeter=4*side;
        System.out.println("Perimeter: "+perimeter);
    }
}
