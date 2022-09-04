package OOP.spec_classes;

public class StringBuilderClass2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Learning is fun");
        sb1.insert(9,"Java ");
        System.out.println(sb1);
        sb1.replace(9,13, "Everything");
        System.out.println(sb1);
        String s1 = "abcdef";
        System.out.println(s1.replace("ab","@"));
        sb1.deleteCharAt(0);
        System.out.println(sb1);
        sb1.delete(2,10);
        System.out.println(sb1);

        System.out.println(sb1.reverse());

    }
}
