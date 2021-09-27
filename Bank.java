//CODED BY @DudeUnoob :)
import java.util.Scanner;
import java.lang.Math;

public class Bank{
  public static double money = 0.0;
  public static String bank = "Chase DudeUnoob";

  
   public void deposit(double amountDeposited) {
    money = money + amountDeposited;
    System.out.println(money);
  }

  public void withdraw(double amountWithdrawed) {
        money = money - amountWithdrawed;
        System.out.println(money);
          }

  public double getBalance(){
    return money;
  }

  public static void main(String[] args){
    System.out.println("Hello welcome to the " + bank + " bank!");
      Bank bank = new Bank();
      Scanner input = new Scanner(System.in);

      String user,pass;

      System.out.print("Enter your username: ");
      user = input.nextLine();

      System.out.print("Enter your password: ");
      pass = input.nextLine();

      if(user.equals("DudeUnoob") && (pass.equals("valorantgamerlol"))){
        System.out.println("Access Granted");
      }
      else {
        System.out.println("Crendentials Incorrect");
      }
      
      if(user.equals("DudeUnoob") && (pass.equals("valorantgamerlol"))){
        Scanner myBank = new Scanner(System.in);

      System.out.println("Enter how much you would like to deposit");

      double moni = myBank.nextDouble();
      bank.deposit(moni);

      System.out.println("You have " + bank.getBalance() + " dollars");
    }
    else {
      System.out.println("Access Denied");
    }
    if(user.equals("DudeUnoob") && (pass.equals("valorantgamerlol"))){
        Scanner myBank2 = new Scanner(System.in);

    System.out.println("Would you like to withdraw something, write 'yes' or 'no': ");
    String yesno = myBank2.next();

    if (yesno.equals("yes")) {
      
        System.out.println("Type how much you would like to withdraw");
        
        double moni = myBank2.nextDouble();
        bank.withdraw(moni);
        
        if(money < 0 )
        {
          System.out.println("Sorry your balance cannot be less then 0 have a great day");
          return;
        }
        System.out.println("Your balance is " + bank.getBalance() + " dollars" + ",have a great day!");
        
      }
      else if (yesno.equals("no")) {
      
        System.out.println("Your balance is " + bank.getBalance() + " dollars" + ",have a great day!");
      } 
    }
    
 }
} 
