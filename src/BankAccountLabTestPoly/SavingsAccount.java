package BankAccountLabTestPoly;

public class SavingsAccount extends Account {
    
    private final double annualIntRate=0.05;

    public double getAnnualIntRate() { return annualIntRate;}

    public SavingsAccount() {}
    
    public SavingsAccount(String accountName, String accountNumber, String typeOfAccount, double balance){
        super(accountName,accountNumber,typeOfAccount,balance);
    }

    public double computeInterest(){
        double nYear, compoundInterest;
        System.out.println("Enter compound year: ");
        nYear = userInput.nextDouble();
        double temp1 = (1 + getAnnualIntRate());
        compoundInterest = getBalance() * (java.lang.Math.pow(temp1,nYear)-1);
        setBalance(getBalance()+compoundInterest);
        return getBalance();
    }  
    
}
