import java.util.Scanner;

public class Game {
    private int antSpeed;
    private int antFoodConsumptionRate;
    private int flagSeqNum;
    private int lastFlagReached;
    private int antFoodLevel;
    private int antHealthLevel;
    private int gameClock;
    private int antSize;
    private int foodStationCapacity;
    private boolean foodStationFaded;
    private boolean antFaded;
    private int antLives;

    public Game() {
        antSpeed = 0;
        antFoodConsumptionRate = 1;
        flagSeqNum = 1;
        lastFlagReached = 0;
        antFoodLevel = 100;
        antHealthLevel = 100;
        gameClock = 0;
        antSize = 40;
        foodStationCapacity = 10;
        foodStationFaded = false;
        antFaded = false;
        antLives = 3;
    }

    public void run() {
        System.out.println("Welcome to TheJourney Game!\n");

        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            printCommands();
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim();

            switch (command) {
                case "a":
                    accelerateAnt();
                    break;
                case "b":
                    brakeAnt();
                    break;
                case "l":
                    turnAntLeft();
                    break;
                case "r":
                    turnAntRight();
                    break;
                case "c":
                    setFoodConsumptionRate(scanner);
                    break;
                case "f":
                    pretendFoodStationCollision();
                    break;
                case "g":
                    pretendSpiderCollision();
                    break;
                case "t":
                    gameClockTick();
                    break;
                case "d":
                    displayGameState();
                    break;
                case "m":
                    showGameWorldMap();
                    break;
                case "x":
                    exitGame(scanner);
                    break;
                case "1": case "2": case "3": case "4": case "5":
                case "6": case "7": case "8": case "9":
                    int flagNumber = Integer.parseInt(command);
                    pretendFlagCollision(flagNumber);
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }

        } while (!command.equals("x"));

        scanner.close();
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("a - Accelerate the ant");
        System.out.println("b - Brake the ant");
        System.out.println("l - Turn the ant left");
        System.out.println("r - Turn the ant right");
        System.out.println("c - Set the food consumption rate of the ant");
        System.out.println("1-9 - Pretend collision with flag (1-9)");
        System.out.println("f - Pretend collision with a food station");
        System.out.println("g - Pretend collision with a spider");
        System.out.println("t - Game clock tick");
        System.out.println("d - Display game state");
        System.out.println("m - Show the game world map");
        System.out.println("x - Exit (type 'y' to confirm, 'n' to cancel)");
    }

    private void accelerateAnt() {
        if (antFoodLevel > 0 && antSpeed < 50) {
            antSpeed += 5;
            antFoodLevel -= antFoodConsumptionRate;
            System.out.println("Ant accelerated.");
        } else if (antSpeed >= 50) {
            System.out.println("Ant already at maximum speed.");
        } else {
            System.out.println("Ant is too hungry to accelerate.");
        }
    }

    private void brakeAnt() {
        if (antSpeed > 0) {
            antSpeed -= 5;
            System.out.println("Ant braked.");
        } else {
            System.out.println("Ant already at minimum speed.");
        }
    }

    private void turnAntLeft() {
        System.out.println("Ant turned left.");
    }

    private void turnAntRight() {
        System.out.println("Ant turned right.");
    }

    private void setFoodConsumptionRate(Scanner scanner) {
        System.out.print("Enter the new food consumption rate for the ant: ");
        int newRate = scanner.nextInt();
        antFoodConsumptionRate = newRate;
        scanner.nextLine(); // Consume the newline character
        System.out.println("Ant's food consumption rate set to " + newRate + ".");
    }

    private void pretendFoodStationCollision() {
        antFoodLevel += foodStationCapacity;
        foodStationCapacity = 0;
        foodStationFaded = true;
        System.out.println("Pretend collision with a food station.");
        System.out.println("Ant's food level increased. Food station faded.");
    }

    private void pretendSpiderCollision() {
        antHealthLevel -= 10;
        antFaded = true;
        antSpeed = Math.min(antSpeed, 50 - antHealthLevel / 10);
        System.out.println("Pretend collision with a spider.");
        System.out.println("Ant's health level decreased. Ant faded.");
    }

    private void gameClockTick() {
        // Implement clock tick logic
        System.out.println("Game clock ticked.");
        gameClock++;
    }

    private void displayGameState() {
        System.out.println("\nGame State:");
        System.out.println("Lives: " + antLives);
        System.out.println("Clock: " + gameClock);
        System.out.println("Last Flag Reached: " + lastFlagReached);
        System.out.println("Ant's Food Level: " + antFoodLevel);
        System.out.println("Ant's Health Level: " + antHealthLevel + "\n");
    }

    private void showGameWorldMap() {
        // Implement logic to print the game world map
        System.out.println("\nGame World Map:");
        System.out.println("Ant: loc=200.0,200.0 color=[255,0,0] heading=0 speed=" + antSpeed + " size=" + antSize);
        System.out.println("Flag: loc=200.0,800.0 color=[0,0,255] size=10 seqNum=" + flagSeqNum);
        // Add more objects as needed
        System.out.println();
    }

    private void pretendFlagCollision(int flagNumber) {
        if (flagNumber == lastFlagReached + 1) {
            lastFlagReached++;
            System.out.println("Pretend collision with flag " + flagNumber);
        } else {
            System.out.println("Invalid flag collision. Expected flag " + (lastFlagReached + 1));
        }
    }

    private void exitGame(Scanner scanner) {
        System.out.print("Are you sure you want to exit? (Type 'y' or 'n'): ");
        String confirmExit = scanner.nextLine().trim();
        if (confirmExit.equals("y")) {
            System.out.println("Goodbye! Exiting the game.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}



