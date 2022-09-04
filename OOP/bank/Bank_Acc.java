package OOP.bank;

public class Bank_Acc {
    private long no;
    private String name;
    private double balance;

    public void deposit(double amt) {
        if (amt > 0) {
            balance = balance + amt;
            System.out.println("Successfully deposited $ " + amt);
        } else {
            System.out.println("Cannot deposit " + amt);
        }
    }

    public void withdraw(double amt) {
        if (amt > 0) {
            balance = balance - amt;
            System.out.println("Successfully withdrawn $ " + amt);
        } else {
            System.out.println("Cannot withdraw " + amt);
        }


    }

    public void dispCurrBal() {
        System.out.println("Current balance $ " + balance);

    }
public Bank_Acc(long no, String name, double balance) {
        this.no = no;
        this.name = name;
        this.balance  = balance;


}
}



