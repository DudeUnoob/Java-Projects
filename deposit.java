import java.util.Scanner;
import java.lang.Math;

public class deposit{
  public double money = 0.0;
  public String bank = "Chase";

  
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

      System.out.println("You have " + bank.getBalance());
    }
    else {
      System.out.println("Access Denied");
    }
  }
}
