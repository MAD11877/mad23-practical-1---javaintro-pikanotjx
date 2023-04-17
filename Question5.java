import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    /* System.out.print("Enter the number of integers: "); */
    Scanner in = new Scanner(System.in);

    int integer = in.nextInt();

    int[] array = new int[integer];

    for (int i = 0; i < integer; i++) {
      array[i] = in.nextInt();
    }

    int maxCount = 0;
    Integer maxInteger = null;
    for (int i : array) {
    int indivCount = -1;
      for (int x : array) {
        if (i == x) {
          indivCount++;
        }
      }
      if (indivCount > maxCount) {
        maxCount = indivCount;
        maxInteger = i;
      }
    }

    System.out.println(maxInteger);
  }
}
