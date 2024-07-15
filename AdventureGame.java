import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        AdventureGame game = new AdventureGame();
        game.startGame();
    }

    private void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You are in a dark forest. You see three paths ahead.");
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");
        System.out.println("3. Go stright");

        int choice = getUserChoice(scanner, 3);

        if (choice == 1) {
            leftPath(scanner);
        } 
        if (choice ==3){
            strightpath(scanner);
        }
        if (choice ==2) {
            rightPath(scanner);
        }

        scanner.close();
    }
    private void strightpath(Scanner scanner){
        System.out.println("You found a man who is in danger.Do you:");
        System.out.println("1. Save him.");
        System.out.println("2. Ignore him and continue walking.");

        int choice = getUserChoice(scanner, 2);
        if (choice == 1){
            System.out.println("Congratulations you saved him and came out of the forest.");
        }
        else{
            System.out.println("Successfully u wasted the opportunity to go out of the forest. ");
        }
    }
    private void leftPath(Scanner scanner) {
        System.out.println("You encounter a wild animal. Do you:");
        System.out.println("1. Run away.");
        System.out.println("2. Fight the animal.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("You successfully ran away. You are safe for now.");
        } else {
            System.out.println("You fought bravely but the animal overpowered you. Game Over.");
        }
    }

    private void rightPath(Scanner scanner) {
        System.out.println("You find a treasure chest. Do you:");
        System.out.println("1. want to open it? then u should solve the puzzele.");
        System.out.println("2. Ignore the chest and continue walking.");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("What is the object present in the middle of the TV");
            System.out.println("1. Screen.");
            System.out.println("2. LED.");
            System.out.println("3. U");
            System.out.println("4. USB");

            int num = getUserChoice(scanner, 4);
            if(num == 3){
                    System.out.println("Congradulations you won the puzzele.and came out of the forest.");
                    System.out.println("GAME OVER!");
            }
            else {
                System.out.println("you lost the game and stuck in the forest.");
            }
        } else {
            System.out.println("You continue walking and eventually find your way out of the forest. You are safe.");
        }
    }

    private int getUserChoice(Scanner scanner, int numChoices) {
        int choice = -1;
        while (choice < 1 || choice > numChoices) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > numChoices) {
                    System.out.println("Invalid choice. Please choose a number between 1 and " + numChoices + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return choice;
    }
}
