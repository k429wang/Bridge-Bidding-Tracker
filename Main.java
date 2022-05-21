import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println(
                "Welcome to Kai Wang's Bridge Bidding Tracker. Enter 'help' to view the commands, and 'quit' to terminate the program");

        Scanner in = new Scanner(System.in);
        Boolean quit = false;
        while (quit == false) {
            String command = in.nextLine();
            switch (command) {
                case "help":
                    System.out.println("e");
                    break;
                case "quit":
                    System.out.println("Thank you for using my program!");
                    System.exit(0);
                case "display":
                    break;
                case "add":
                    break;
                case "traverse":
                    break;
            }
        }

    }
}
