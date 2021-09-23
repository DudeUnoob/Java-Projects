import java.util.Scanner;
import java.lang.Math;

public class Withdrawer{
  public static double money = 50.5;
  public static String bank = "Chase";

  
   static void Withdraw(double amountWithdrawed) {
    double Withdraw = money - amountWithdrawed;
    System.out.println(Withdraw);
  }

  public static void main(String[] args){
      Scanner input2 = new Scanner(System.in);

      String user,pass;

      System.out.print("Enter your username: ");
      user = input2.nextLine();

      System.out.print("Enter your password: ");
      pass = input2.nextLine();

      if(user.equals("DudeUnoob") && (pass.equals("valorantgamerlol"))){
        System.out.println("Access Granted");
      }
      else {
        System.out.println("Crendentials Incorrect");
      }
      
      if(user.equals("DudeUnoob") && (pass.equals("valorantgamerlol"))){
        Scanner myBank = new Scanner(System.in);

      System.out.println("Enter how much you would like to withdraw");


      double moni = myBank.nextDouble();
      double total = moni - money;

      System.out.println("You have " + Math.abs(total) + " dollars");
    }
    else {
      System.out.println("Access Denied");
    }
  }
}
