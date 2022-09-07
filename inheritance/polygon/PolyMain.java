package inheritance.polygon;

public class PolyMain {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.setBaseAndHeight(10.0, 11.1);
        t1.calcArea();

        Rectangle r1 = new Rectangle();
        r1.setBaseAndHeight(20.0, 21.1);
        r1.calcArea();
    }
}
