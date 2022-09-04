package OOP.keywords;

public class Static_Main {
    public static void main(String[] args) {
        Static_Keyword s1 = new Static_Keyword();
        Static_Keyword s2 = new Static_Keyword();

        s1.age = 7;
        s1.grade =  "2nd";
        Static_Keyword.name = "Rob";
        Static_Keyword.doThis();


        s2.age = 8;
        s2.grade =  "3rd";
        Static_Keyword.name = "Sue";
        Static_Keyword.doThis();

        s1.dispDet();
        s2.dispDet();


    }
}
