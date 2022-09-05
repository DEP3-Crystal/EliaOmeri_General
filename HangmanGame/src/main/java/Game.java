import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static Scanner input;
    public static void hangman(User user) {
        List<String> wordsToBeGuessed = List.of("pencil", "glasses", "medicine", "lesson","work","attraction","population","attitude","energy","trainer","dentist","useful");
        input = new Scanner(System.in);
        System.out.println("Welcome to Hangman Game! Enjoy it!");
        //Chooses a random number from the length of the list of words to be guessed
        Random rand = new Random();
        int randomNumber = rand.nextInt(wordsToBeGuessed.size());
        //accesses the word
        String word = wordsToBeGuessed.get(randomNumber);
        word = word.toLowerCase();
        // To show the word in underscores
        String word1 = word.replaceAll("[a-z]", "_ ");
        //play the game
        System.out.println("Start the game!");
        startGame(word,word1,user);
    }

    public static void startGame(String word_1, String word_2,User user) {
        // total guesses
        int totalGuesses = 0;

        // number of wrong guesses
        int wrongGuesses = 0;

        // for each guess
        String guess;

        // stores the guessed letter
        char letter;

        // stores if the letter was
        // already guessed
        boolean guessesContainsGuess;
        String guesses = "";
        boolean guessInWord;

        while (wrongGuesses < 6 && word_2.contains("_")) {
            System.out.println("Player : "+ user.userName.toUpperCase()+ "\n Word that you must guess:"+word_2 + "\n");
            int tmp = 6 - wrongGuesses;
            if (wrongGuesses != 0) {
                System.out.println("You have " + tmp + "guesses left.");

            }
            System.out.println("Your Guess:");
            guess = input.nextLine();
            guess = guess.toLowerCase();
            letter = guess.charAt(0);
            guessesContainsGuess = (guesses.indexOf(letter)) != -1;
            // stores every letter
            // guessed in guesses
            guesses += letter;
            // converts to uppercase for
            // comparison
            letter = Character.toLowerCase(letter);
            System.out.println();

            // if letter already guessed
            if (guessesContainsGuess == true) {

                // already guessed letter
                System.out.println("You ALREADY guessed "
                        + letter + ". \n");
            }
            // guessed letter is in the word
            guessInWord = (word_1.indexOf(letter)) != -1;
            // if statement begins
            if (guessInWord == true) {

                // print the letter
                System.out.println(
                        letter + " is present in the word.");
                System.out.print("\n");

                for (int position = 0;
                     position < word_1.length(); position++) {

                    if (word_1.charAt(position) == letter
                            && word_2.charAt(position)
                            != letter) {

                        word_2 = word_2.replaceAll("_ ", "_");
                        String word3;
                        word3 = word_2.substring(0, position)
                                + letter
                                + word_2.substring(position
                                + 1);
                        word3 = word3.replaceAll("_", "_ ");
                        word_2 = word3;
                    }
                }
                }
            else {
                System.out.println(letter + " is not present in the word.");
                wrongGuesses++;
            }
            totalGuesses++;
        }
        if (wrongGuesses == 6) {
            System.out.println("You lost! Maximum incorrect answers reached!");
        } else {
            System.out.println("The word is: " + word_2 + "\nWell played " +user.userName.toUpperCase()+"!" );
            user.score++;
            System.out.println( "You scored: "+ user.score );
        }
    }

}