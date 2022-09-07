package interf;

public interface Interf1 {

    static final int a = 10;
    void doThis();

    static void xyz(){
        System.out.println("Static xyz from Interf1");
    }

    default void uvw(){
        System.out.println("Default uvw from Interf1");
    }
}
