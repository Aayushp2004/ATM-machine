import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 5674;

    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int Enteredpin = sc.nextInt();
        if (Enteredpin==PIN){
            menu();
        }else {
            System.out.println("Valid Pin!!!.");
        }


    }
    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt ==1){
            checkBalance();
        }
        else if (opt ==2) {
            withhdrawMoney();
        }
        else if (opt == 3) {
            DepositMoney();
        } else if (opt == 4) {
            return;
        }
        else{
            System.out.println("Enter a valid choice!!");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withhdrawMoney(){
        System.out.println("Enter withdraw Amount:");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        if (Amount > Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance - Amount;
            System.out.println("Money withdraw Successful");

        }
        menu();

    }
    public void DepositMoney(){
        System.out.println("Enter Amount :");
        Scanner sc =new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited is Successfully");

    }
}
