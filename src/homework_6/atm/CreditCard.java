package homework_6.atm;

public class CreditCard {
    long creditCardAccountNumber;
    long creditCardBalance;

    public CreditCard(long creditCardAccountNumber, long creditCardBalance){
        this.creditCardAccountNumber = creditCardAccountNumber;
        this.creditCardBalance = creditCardBalance;
    }



    public String getCreditCardInformation() {
        return "Credit card account number is: " + creditCardAccountNumber + "\n" +
                "Credit card balance is: " + creditCardBalance + "\n";
    }

    public void addMoney(long money){
        this.creditCardBalance += money;
    }

    public void takeMoney(long money){
        this.creditCardBalance -= money;
    }

    public long getBalance(){
        return this.creditCardBalance;
    }
}

