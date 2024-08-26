import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1, number2;
        char operation;

        try {
            number1 = sc.nextDouble();
            operation = sc.next().charAt(0);
            number2 = sc.nextDouble();

            switch (operation) {
                case '+':
                    System.out.println(number1 + number2);
                    break;
                case '-':
                    System.out.println(number1 - number2);
                    break;
                case '*':
                    System.out.println(number1 * number2);
                    break;
                case '/':
                    System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println("Enter valid operation (i.e. + - * /)");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}