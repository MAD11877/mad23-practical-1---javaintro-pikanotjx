import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    System.out.print("Enter your height in meters: ");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();

    System.out.print("Enter your weight in kilograms: ");
    Scanner in = new Scanner(System.in);
    double weight = in.nextDouble();

    double BMI = weight / (height * height);
    System.out.println(BMI);
  }
}
