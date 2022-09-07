package inheritance.polygon;

public class Triangle extends Polygon {

    public void calcArea(){
        System.out.println("Triangle's Area: " + (0.5*base*height));
    }
}
