public class Credit extends Account{
    private double creditLimit = 500;

    public Credit(){
        super();
    }

    public Credit(double balance){
        setBalance(creditLimit);
    }

    @Override
    public boolean deposit(double _amount) {
        if(_amount>creditLimit - getBalance()){
            System.out.println("Payment is too large");
            System.out.println("Your credit is " +getBalance());
            return false;

        }
        else if(_amount<=creditLimit - getBalance()){
            setBalance(getBalance() + _amount);
            System.out.println("Your credit is " +getBalance());
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double _amount) {
        if(getBalance()==0){
            System.out.println("Credit limit reached");
            System.out.println("Your credit is " +getBalance());
            return false;
        }
        else if (_amount<= getBalance()){
            setBalance(getBalance() - _amount);
            System.out.println("Your credit is " +getBalance());
            return true;
        }
        else{
            System.out.println("Amount exceeds credit limit");
            System.out.println("Your credit is " +getBalance());
            return false;
        }

    }
}
