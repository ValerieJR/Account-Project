public class Debit extends Account {
    public Debit() {
        super();
    }
    public Debit(double promo){
        setBalance(promo);
    };

    @Override
    public boolean deposit(double _amount) {
        boolean value = false;
        if(_amount<=0){
            System.out.println("Incorrect Amount. Value is less than or equal to 0");
            value = false;

        }
        else if(_amount>0){
            setBalance(getBalance() + _amount);

            /*
                double balance = getBalance();
                balance = balance + amount;
                setBalance(amount);
             */
            value = true;
        }
        return value;
    }

    @Override
    public boolean withdraw(double _amount) {
        if(_amount>getBalance()){
            System.out.println("You have no money");

            return false;
        }
        else if(_amount<=getBalance()){
            setBalance(getBalance() - _amount);

            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        String content = "The current balance is: " + getBalance();
       return content;
    }
}
