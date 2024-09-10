//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Debit dpt1 = new Debit();
    Debit dpt2 = new Debit(25);
    System.out.println(dpt2.toString());
    dpt2.deposit(100);
    System.out.println(dpt2.toString());
    dpt2.withdraw(25);
    System.out.println(dpt1.toString());
    System.out.println(dpt2.toString());

    Credit c1 = new Credit(500);
    c1.withdraw(45);
    c1.deposit(50);
    c1.deposit(40);
    c1.withdraw(600);

    Loan l1 = new Loan(100000);
    l1.withdraw(200000);
    l1.withdraw(100000);
    l1.deposit(50);
    l1.deposit(1000);
    l1.deposit(900);
    }
}