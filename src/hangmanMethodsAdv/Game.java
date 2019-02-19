package hangmanMethodsAdv;

import java.util.Scanner;

public class Game {
    private static final int NEW_GAME = 1;
    private static final int END_GAME = 2;

    private WordsDatabase db = new WordsDatabase();
    private Scanner sc = new Scanner(System.in);

    public void mainLoop() {
        int option = NEW_GAME;
        while (option != END_GAME) {
            play();
            showOptions();
            option = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Bye, bye");
    }

    private void showOptions() {
        System.out.println(NEW_GAME + " - Graj dalej");
        System.out.println(END_GAME + " - Zakończ rozgrywkę");
    }

    private void play() {
        Hangman hangman = new Hangman(db.getRandomWord());
        do {
            System.out.println("\nHasło do zgadnięcia");
            String guessWordDisplay = hangman.getGuessWordDisplay();
            System.out.println(guessWordDisplay);
            System.out.println("Podaj literę");
            String line = sc.nextLine();
            char usersGuess = line.charAt(0);
            hangman.checkLetter(usersGuess);
        } while (!hangman.userLost() && !hangman.userWon());
        System.out.println();
        if (hangman.userLost())
            System.out.println("Przegrałeś!");
        else if (hangman.userWon())
            System.out.println("Wygrałeś");
        System.out.printf("Hasło: %s\n\n", hangman.getGuessWord());
    }
}