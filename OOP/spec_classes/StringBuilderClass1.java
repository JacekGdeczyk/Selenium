package OOP.spec_classes;

public class StringBuilderClass1 {
    public static void main(String[] args) {
        String s1 = "I";
        s1 = s1 + " Like";
        s1 = s1 + " Java";
        System.out.println(s1);
        StringBuilder sb1 = new StringBuilder("I");
        sb1.append(" Like");
        sb1.append(" Java");
        System.out.println(sb1);
        }
}
