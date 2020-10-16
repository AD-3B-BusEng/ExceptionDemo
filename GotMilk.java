
import java.util.Scanner;

public class GotMilk {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter number of donuts:");
    int donutCount = keyboard.nextInt();
    System.out.println("Enter number of glasses of milk:");
    int milkCount = keyboard.nextInt();
    // Dealing with an unusual event without Javas exception
    // handling features:
    if (milkCount < 1) {
      System.out.println("No miooolk!");
      System.out.println("Go buy some milk.");
    } else {
      double donutsPerGlass = donutCount / (double) milkCount;
      System.out.println(donutCount + " donuts.");
      System.out.println(milkCount + " glasses of milk.");
      System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk.");
    }
    System.out.println("End of program.");
  }

}
