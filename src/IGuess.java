import java.util.Scanner;

public class IGuess {
    private int randomNumber = (int)(Math.random()*100)+1, minDiapason=1, maxDiapason=100;
    private boolean haswon = false;

    public void game () {
        System.out.println(randomNumber);
        System.out.println("guess the number: ");

        Scanner s = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("guesses left: " + i + "\n");
            int guess = s.nextInt();

            if (randomNumber < guess) {
                System.out.println("\nnumber is smaller than  " + guess);
                maxDiapason = guess-1;
                System.out.println("Try new diapason: [" + minDiapason + "; " + (maxDiapason)  + "]");
            }
            else if (randomNumber > guess) {
                System.out.println("\nnumber is greater than  " + guess);
                minDiapason = guess + 1;
                System.out.println("Try new diapason: [" + minDiapason + "; " + maxDiapason + "]");
            }
            else {
                haswon = true;
                break;
            }
        }
        if (haswon) {
            System.out.println("\nCorrect! Its " + randomNumber + "!!!");
        }
        else {
            System.out.println("\nGame over... The number was " + randomNumber);
        }
    }
}
