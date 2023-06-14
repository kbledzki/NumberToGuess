import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello, in this program the computer will draw a number between 1 and 100, please try to guess the number");
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        boolean wasTheNumberGuess = false;
        int yourNumber = 0;

        for (int i = 10; i > 0; i--) {
            if (wasTheNumberGuess) {
                break;
            } else {
                System.out.println(separte);
                System.out.println("You have " + i + " attempts, enter number: ");
                boolean correctAnswer = true;
                while (correctAnswer) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        yourNumber = scanner.nextInt();
                        if (yourNumber > numberToGuess) {
                            System.out.println("Number is too high");
                        }
                        if (yourNumber < numberToGuess) {
                            System.out.println("Number is to low");
                        }
                        if (yourNumber == numberToGuess) {
                            wasTheNumberGuess = true;
                        }
                        correctAnswer = false;
                    } catch (Exception e) {
                        System.out.println("Wrong! Enter number:");
                    }
                }
            }
        }

        if (wasTheNumberGuess) {
            System.out.println("Congratulations, that's exactly the number");
        } else {
            System.out.println("Unfortunately, the attempts are over, the number could not be guessed, the number you are looking for is: " + numberToGuess);
        }
    }

    final static String separte = "************************";
}