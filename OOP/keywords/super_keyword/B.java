package OOP.keywords.super_keyword;

public class B extends A{
    int a = 200;
    public void doThis() {
        System.out.println("Do This From B");
    }

    public void xyz(){
        System.out.println(super.a);
        super.doThis();
        System.out.println("XYZ Executed");
    }
}
