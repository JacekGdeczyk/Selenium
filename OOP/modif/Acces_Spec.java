package OOP.modif;

public class Acces_Spec {

    public int a = 100;
    int b = 200;
    private int c = 300;

    public void doThisPublic() {
        System.out.println("Public");

    }

    private void doThisPriv() {
        System.out.println("Priv");
    }

    void doThisDef() {
        System.out.println("Def");
    }
}
