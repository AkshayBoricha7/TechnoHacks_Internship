import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessTheNumberGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int uc = 1;
    try {
      while(uc==1) {
        int score = 0;
        int round = 1;
        while(round<=5) {
          int guessLeft = 7;
          int randomNumber = (int) ((Math.random() * 100) + 1);
          System.out.println("\nRound - " + round);
          while(guessLeft>0) {
            System.out.print("Enter a number between 1 and 100: ");
            int guess = sc.nextInt();

            if(guess==randomNumber) {
              System.out.println("Your guess is correct! You won the round.");
              score += 20;
              break;
            } else if(guess < randomNumber) {
              System.out.println("Your guess is too low.");
            } else {
              System.out.println("Your guess is too high.");
            }
            guessLeft--;
          }
          round++;
        }
        System.out.println("\nYou scored " + score + " out of 100");
        System.out.println("\nEnter 1 to play again.");
        uc = sc.nextInt();
      }
    } catch (InputMismatchException e) {
      System.out.println("Error: Input must be an integer number only");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    finally {
      sc.close();
    }
  }
}