import java.util.Scanner;

public class testBin2Dec {
  public static void main(String[] args) {
    //creates a Scanner
    Scanner input = new Scanner(System.in);

    //asks the user to enter a binary string
    System.out.print("Enter a binary: ");
    try {
      System.out.println(Exercise12_07.bin2Dec(input.nextLine()));
    }
    catch (NumberFormatException ex) { //catches the exception
      System.out.println(ex.getMessage());
    }
  }
}