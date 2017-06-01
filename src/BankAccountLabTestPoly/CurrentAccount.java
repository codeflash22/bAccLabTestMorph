
package BankAccountLabTestPoly;


public class CurrentAccount extends Account {
    private final double annualIntRate=0;
    public double getAnnualIntRate() { return annualIntRate;}
    
    public CurrentAccount() {}
    public CurrentAccount(String accountName, String accountNumber, String typeOfAccount, double balance){
        super(accountName,accountNumber,typeOfAccount,balance);
    }
    
    public double computeInterest(){
        setBalance(getBalance()+getAnnualIntRate());
        return getBalance();
    }
}
