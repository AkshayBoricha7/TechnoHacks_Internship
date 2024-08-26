import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Stack<String> tasks = new Stack<String>();
        int uc = 0, flag = 1;
        try {
            while (flag == 1) {
                System.out.println("\n1. Add an item");
                System.out.println("2. Remove an item");
                System.out.println("3. View items");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                uc = sc.nextInt();

                switch (uc) {
                    case 1:
                        tasks.add(sc2.nextLine());
                        break;
                    case 2:
                        String itemToRemove = sc2.nextLine();
                        if (tasks.contains(itemToRemove))
                            tasks.remove(itemToRemove);
                        else
                            System.out.println("item not found");
                        break;
                    case 3:
                        System.out.println(tasks.reversed());
                        break;
                    case 4:
                        flag = 0;
                        break;
                    default:
                        System.out.println("Invalid input");

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            sc2.close();
            tasks.clear();
        }
    }
}
