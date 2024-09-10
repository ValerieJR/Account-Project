public class Loan extends Account{
    private double interestRate = 0.0046;
    private double approvedLoan;
    private double minDeposit;
    private double interestPaid = 0;
    private double principalPaid = 0;
    private double interest =0;

    public Loan(){
        super();
    }

    public Loan(double _amount){
        approvedLoan = _amount;
    }

    @Override
    public boolean deposit(double _amount) {
        if(_amount<minDeposit){
            System.out.println("Your payment does not reach the minimum payment");
        }
        else if(_amount>=minDeposit){
            interest = getBalance() * interestRate;
            System.out.println(interest);
            setBalance(getBalance()+ interest);
            interestPaid = interestPaid +interest;
            principalPaid = principalPaid + (_amount-interest);
            setBalance(getBalance()-_amount);
            System.out.print("Principal paid ");
            System.out.printf("%.2f", principalPaid);
            System.out.println();
            System.out.print("Interest paid " );
            System.out.printf("%.2f",interestPaid);
            System.out.println();
            System.out.print("Outstanding balance ");
            System.out.printf("%.2f", getBalance());
            System.out.println();
        }
        return false;
    }

    @Override
    public boolean withdraw(double _amount) {
        if(getBalance()>0){
            System.out.println("You have already taken out a loan");
        }
        else if(_amount>approvedLoan){
            System.out.println("The withdrawal amount exceeds you loan approval amount");
        }
        else if(getBalance()==0){
            setBalance(_amount);
            minDeposit = 0.008 * _amount;
            System.out.println("minimum deposit " +minDeposit);
            System.out.println("You have take out a loan of " + _amount);
        }
        return false;
    }
}
