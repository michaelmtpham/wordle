import java.util.Scanner;
public class Driver {

    public void start(GameConfiguration config) {
        // TODO: complete this method
        // We will call this method from our JUnit test cases.
        Scanner scan = new Scanner(System.in);
        boolean playGame = false;
        System.out.println("Hello! Welcome to Wordle.");
        System.out.println("Do you want to play a new game? (y/n) ");
        String decision = scan.nextLine();
        while (decision.equals("y")) {
            Game game = new Game(scan, config);
            System.out.println("Do you want to play a new game? (y/n) ");
            decision = scan.nextLine();
        }

    }

    public void start_hardmode(GameConfiguration config) {
        // TODO: complete this method for extra credit
        // We will call this method from our JUnit test cases.
    }

    public static void main(String[] args) {
        // Use this for your testing.  We will not be calling this method.
        GameConfiguration gameConfiguration = new GameConfiguration(5, 3, true);
        Driver driver = new Driver();
        driver.start(gameConfiguration);
    }
}
