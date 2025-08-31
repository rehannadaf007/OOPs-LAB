import java.util.Scanner;
class ATMS{
public double balance;
public ATMS(double initialBalance){
this.balance = initialBalance;
}

public void checkBalance(){
System.out.println("Your current balance is : Rupees" + balance);
}

 public void deposit(double amount)
 {
if (amount <= 0){
throw new
IllegalArgumentException("Deposit amount must be positive.");
}
balance += amount;
System.out.println("Successfully deposited Rupees" + amount);
}

void withdraw(double amount)
 {
 if (amount <= 0){
 throw new 
 IllegalArgumentException("Withdrawal amount must be positive.");
 }
 if(amount > balance){
 throw new
 ArithmeticException("Insufficient funds! Your balance is only Rupees" + balance);
 }
 balance -= amount;
 System.out.println("Successfully withdrawn Rupees"+ amount);
 }
 }
 
  public class ATM
 {
  public static void main(String[]args)
  {
  Scanner sc = new Scanner(System.in);
  ATMS atm = new ATMS(5000);
  boolean running = true;
  System.out.println("---WELCOME TO ATM SYSTEM---");
  while(running){
  System.out.println("Choose an option:");
  System.out.println("1.Check Balance.");
  System.out.println("2. Deposit Money.");
  System.out.println("3.Withdraw Money.");
  System.out.println("4.Exist");
  System.out.println("Enter choice:");
  try{
  int choice = sc.nextInt();
  switch (choice){
  case 1:
  atm.checkBalance();
  break;
  case 2:
  System.out.print("Enter amount to deposit:");
  double depositAmount = sc.nextDouble();
  atm.deposit(depositAmount);
  break;
  case 3:
  System.out.print("Enter amount to withdraw:");
  double withdrawAmount = sc.nextDouble();
  atm.withdraw(withdrawAmount);
  break;
  case 4:
  running = false;
  System.out.println("Thankyou for using ATM.");
  break;
  default:
  throw new 
  IllegalArgumentException("Invalid menu option.Choose 1-4.");
  }
  }catch
  (IllegalArgumentException e){
  System.out.println("Error :"+ e.getMessage());
  }
  catch
  (ArithmeticException e){
  System.out.println("Error :" + e.getMessage());
  }
  catch(Exception e){
  System.out.println("Unexpected error: "+ e.getMessage());
  }
  finally{
  System.out.println("Opeartion completed.Returning to main menu.");
  }
  }
  sc.close();
  }
  
  }