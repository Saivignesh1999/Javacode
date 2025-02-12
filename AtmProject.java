import java.util.Scanner;
public class AtmProject {
    private int balance;
    private int pin= 9849;
                             
    public AtmProject(int balance,int pin){
        this.balance=balance;
        this.pin=pin;
    }
    public void displayMenu(){
      System.out.println("1.Check balance");
      System.out.println("2.Deposit");
      System.out.println("3.Withdraw");
      System.out.println("4.Change pin");
      System.out.println("5.Exit");
 }
 public void deposit(int amount){
     balance+=amount;
     System.out.println("Your A/C Balance is : "+ balance);
     return;
 }
 public void withdraw(int amount){
   if(balance<amount){
    System.out.println("Insufficient Funds");
    return;
   }
   balance-=amount;
    System.out.println("Your Balance is : "+ balance);
    
 }
 public int getBalance(){
    return balance;
 }  
  public boolean validatePin(int pin){
    return this.pin==pin;
  }
 public void changePin(int newPin){
    pin=newPin;
    System.out.println("Your pin Changed Successfully your pin is : "+ pin);
 }

public static void main(String[]args){
    AtmProject atm = new AtmProject(1000, 9849);
    System.out.println("Enter the pin");
    Scanner sc = new Scanner(System.in); 
   int pin = sc.nextInt();
   if(atm.validatePin(pin)){
    atm.displayMenu();
    System.out.println("Enter the Option");
   int option = sc.nextInt();
    while(option!=6){
      switch(option){
        case 1: 
        atm.getBalance();
        System.out.println("Your A/C Balance is : "+ atm.getBalance());
            break;
        
        case 2:
        System.out.println("Enter the amount");
       int amount=sc.nextInt();
        atm.deposit(amount);
         break;
       
         case 3:
        System.out.println("Enter the withdraw amount");
        amount=sc.nextInt();
        atm.withdraw(amount);
        break;
       
        case 4:
        System.out.println("Enter the New pin");
        int newPin=sc.nextInt();
        atm.changePin(newPin);
        break;
       
        case 5:
        System.out.println("Thank You for visiting ATM");
        break;
       
        case 6: 
        break;
       
        default: 
        break;

      } 
        break;
    } 
      
    }
else    
     System.out.println("Wrong pin");
  
   }
}

