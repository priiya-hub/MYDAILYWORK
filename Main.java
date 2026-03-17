import java.util.Scanner;
class Account{
    private double balance;
    public Account(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;

    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal successful.Current balance :"+balance);
        }
        else{
            System.out.println("Invalid amount or insufficient funds.");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successful.Current balance :"+balance);
        }
        else{
            System.out.println("Invalid amount ");
        }
    }
}
class ATM{
    private Account userAcc;
    private Scanner scanner;
    public ATM(Account acc){
     userAcc=acc;
     scanner=new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("\nATM Menu: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
    }
    public void transaction(){
        int choice;
        do{
            displayMenu();
            System.out.print("Enter your choice : ");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Current balance : "+userAcc.getBalance());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount : ");
                    double withdrawAmount=scanner.nextDouble();
                    userAcc.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount : ");
                    double depositAmount=scanner.nextDouble();
                    userAcc.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice!=4);
    }
}
public class Main{
    public static void main(String[] args){
        Account userAcc=new Account(1000);
        ATM atm=new ATM(userAcc);
        atm.transaction();
    }
}