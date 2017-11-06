import javax.swing.*;

public class Generate {

    public static String moreOrLess = "Have a guess!";

    public static int guesses = 0;
    // Gest random number.
    public static double random = random();

    public static void main(String[] args){
        // Initiate game
        guess();
    }

    public static double random(){
        // Random generator, generate random number between 1-100.
        double randomOutput = Math.floor(Math.random() * 100) + 1;
        return randomOutput;
    }

    public static void guess(){


        double guessInt = Integer.parseInt(JOptionPane.showInputDialog(null, moreOrLess));

            if(random == guessInt){
                // If guess was correct, show message dialog and end sequence.
                JOptionPane.showMessageDialog(null, "You guessed right! The random number was: " + random + " \n You got it in " + guesses + " guesses.");
                return;
            }
            if(guessInt > random){
                moreOrLess = "Guess less!";
            }
            if(guessInt < random){
                moreOrLess = "Guess more!";
            }
            guesses++;
            guess();
            return;
    }
}
