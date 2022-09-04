package OOP.methods;

public class Methods {
    public static void main(String[] args) {

        Methods m = new Methods();
        m.doThis();
        m.addition(1,2);
        int x = m.multiplication(10,20);
        System.out.println(x);
    }

    public void doThis() {
        System.out.println("Do This executed");
    }

    public void addition(int a, int b){
        System.out.println(a+b);

    }

    public int multiplication(int a, int b){
        int c = a*b;
        return c;
    }
}
