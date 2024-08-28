import java.util.Scanner;

class ATM{
    float balance;
    int PIN=1234;

    public void checkpin()
    {
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else
        {
            System.out.println("Enter valid PIN");
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1.Check account balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1)
        {
            checkBalance();
        }
        else if(opt==2)
        {
            withdrawMoney();
        }
        else if(opt==3)
        {
            depositMoney();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter a Valid Choice");
        }
    }

    public void checkBalance()
    {
        System.out.println("balanace"+balance);
        menu();
    }

    public void withdrawMoney()
    {
        System.out.println("Enter amount to be withdraw:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if (amount>balance) 
        {
            System.out.println("Insufficient Balance!");
        }
        else{
            balance=balance-amount;
            System.out.println("withdrawn amount :"+balance);
        }
        menu();

    }
    public void depositMoney()
    {
        System.out.println("enter amount to be deposited?");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat(); 
        balance=balance+amount;
        System.out.println("money depsited successfully");
        menu();
    }
  
}

public class main
{
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();
        obj.withdrawMoney();
        obj.depositMoney();
        
    }
}