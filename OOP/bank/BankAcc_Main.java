package OOP.bank;

public class BankAcc_Main {
    public static void main(String[] args) {
        Bank_Acc b1  = new Bank_Acc(1234,  "Jan", 1000 );
        b1.dispCurrBal();
        b1.withdraw(500);
        b1.dispCurrBal();
        b1.deposit(-100);
        b1.dispCurrBal();
        b1.deposit(1000);
        b1.dispCurrBal();


    }
}
