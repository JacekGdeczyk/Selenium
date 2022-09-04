package OOP.encaps;

public class Classroom {
    private String sub;
    private int stdCount;

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getStdCount() {
        return stdCount;
    }

    public void setStdCount(int stdCount) {
        this.stdCount = stdCount;
    }

    public void dispDet(){
        System.out.println("This is a " + sub + " classroom and it has " + stdCount + " students");
    }
}
