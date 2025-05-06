import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

 class DequeEx{
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Deque Operations Menu ---");
            System.out.println("1. Add ");
            System.out.println("2. Poll from front");
            System.out.println("3. Poll from rear");
            System.out.println("4. Display deque");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            String value;
            switch (choice) {
                case 1:
                    System.out.print("Enter string to add to front: ");
                    value = scanner.nextLine();
                    deque.addFirst(value);
                    System.out.println("\"" + value + "\" added to the front.");
                    break;                                               
                case 2:
                    value = deque.poll();
                    if (value != null) {
                        System.out.println("\"" + value + "\" polled from the front.");
                    } else {
                        System.out.println("Deque is empty!");
                    }
                    break;
                case 3:
                    value = deque.pollLast();
                    if (value != null) {
                        System.out.println("\"" + value + "\" polled from the rear.");
                    } else {
                        System.out.println("Deque is empty!");
                    }
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        System.out.println("Deque is empty.");
                    } else {
                        System.out.println("Current Deque: " + deque);
                    }
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

