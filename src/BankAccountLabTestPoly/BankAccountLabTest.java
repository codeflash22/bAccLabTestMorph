package BankAccountLabTestPoly;

/**
 *
 * @author ASIF
 */
import java.util.Scanner;
public class BankAccountLabTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Polymorphism
        //One Process
        /*Account Acc[] = new Account[2];
        Acc[0] = new SavingsAccount();
        Acc[1] = new CurrentAccount();
        
        for(int i=0; i<2; i++){
            Acc[i].createAccount();
            Acc[i].depAmount();
            Acc[i].computeInterest();
            Acc[i].showAccount();
            Acc[i].showBalance();
            System.out.println("If you want to withdraw some money press 1 otherwise 0: ");
            int flag = input.nextInt();
            if(flag==1) Acc[i].withdraw();
            else Acc[i].showBalance();

        }*/
        
        //Another similar process of using polymorphism
        Account[] AccList = new Account[2];
        SavingsAccount sAcc = new SavingsAccount();
        CurrentAccount cAcc = new CurrentAccount();
        
        AccList[0] = sAcc;
        AccList[1] = cAcc;
        
        for(Account i: AccList){
            i.createAccount();
            i.depAmount();
            i.computeInterest();
            i.showAccount();
            i.showBalance();
            System.out.println("If you want to withdraw some money press 1 otherwise 0: ");
            int flag = input.nextInt();
            if(flag==1) i.withdraw();
            else i.showBalance();                
        }
    }
}
