import java.util.Scanner;

public class Game {
//TODO: Design a Game.java class to handle top-level gameplay
//You may add whatever constructor or methods you like

    private Scanner scan;
    private GameConfiguration gameConfiguration;
    private Dictionary dictionary;

    public Game(Scanner scanner, GameConfiguration gameConfiguration) {
        this.scan = scanner;
        this.gameConfiguration = gameConfiguration;
        this.dictionary = new Dictionary("5_letter_words.txt" );
        System.out.println("Enter your guess: ");
        String guess = scan.nextLine();
        while (!(checkLength(guess)) || !(inDictionary(guess))) {
            if (!(checkLength(guess))) {
                System.out.println("This word has an incorrect length. Please try again");
                guess = scan.nextLine();
            }
            if (!(inDictionary(guess))) {
                System.out.println("This word is not in the dictionary. Please try again.");
                guess = scan.nextLine();
            }
        }
        RandomWord randomWord = new RandomWord(5, dictionary);




    }
    private boolean checkLength (String guess) {
        return (guess.length() == gameConfiguration.wordLength);
    }

    private boolean inDictionary(String guess) {
        return (dictionary.containsWord(guess));
    }
}
