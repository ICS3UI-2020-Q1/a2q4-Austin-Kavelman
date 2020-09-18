import java.util.Scanner;

/**
 * This program calculates the discouts of the retail store
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Asks the user to enter the amount the customer spent
    System.out.println("Please enter the amount the customer spent:");

    //Create interger for amount
    int amount = input.nextInt();

    //Created constant for 10% off
    final double TEN_PERCENT = 40.0;

    //Created constant for 20% off
    final double TWENTY_PERCENT = 40.01;
    final double TWENTY_PERCENT2 = 80.0;

    //Created constant for 30% off
    final double THIRTY_PERCENT = 80.01;
    final double THIRTY_PERCENT2 = 120.0;

    //Created constant for 40% off
    final double FOURTY_PERCENT = 120.01;

    if (amount <= TEN_PERCENT) {
    System.out.println("You will recieve a 10% discount");
    System.out.println("They will recieve $" + amount*0.1 + " off");
    System.out.println("The new total: $" + amount*0.9);
    } else if (amount >= TWENTY_PERCENT && amount <= TWENTY_PERCENT2) {
    System.out.println("You will recieve a 20% discount");
    System.out.println("They will recieve $" + amount*0.2 + " off");
    System.out.println("The new total: $" + amount*0.8);
    } else if (amount >= THIRTY_PERCENT && amount <= THIRTY_PERCENT2) {
    System.out.println("You will recieve a 30% discount");
    System.out.println("They will recieve $" + amount*0.3 + " off");
    System.out.println("The new total: $" + amount*0.7);
    } else {
    System.out.println("You will recieve a 40% discount");
    System.out.println("They will recieve $" + amount*0.4 + " off");
    System.out.println("The new total: $" + amount*0.6);
    }






  }
}
