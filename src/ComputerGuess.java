import java.util.Scanner;

public class ComputerGuess {

    private boolean haswon = false;
    private int myNumber;

    public  void CompGuess(){
        int minDiapason=1, maxDiapason=100;
        boolean haswon = false;
        System.out.println("enter the number from " + minDiapason + " to " + maxDiapason);
        Scanner s = new Scanner(System.in);
        myNumber = s.nextInt();

        System.out.println("I guess the number: " + myNumber);

        for (int i = 10; i > 0; i--) {
            System.out.println("guesses left: " + i + "\n");
            int computerGuess = (int)(Math.random()*(maxDiapason-minDiapason))+ (minDiapason+1);
            System.out.println("computer guesses " + computerGuess);
            if (myNumber < computerGuess) {
                System.out.println("\nnumber is smaller than  " + computerGuess);
                maxDiapason = computerGuess-1;
                System.out.println("Try new diapason: [" + minDiapason + "; " + (maxDiapason)  + "]");
                if (minDiapason == maxDiapason){
                    System.out.println("wait...\nminDiapason = maxDiapason = " + myNumber);
                    System.out.println("then the number must be..." + myNumber + "?!");
                    haswon = true;
                    break;
                }
            }
            else if (myNumber > computerGuess) {
                System.out.println("\nnumber is greater than  " + computerGuess);
                minDiapason = computerGuess+1;
                System.out.println("Try new diapason: [" + minDiapason + "; " + maxDiapason + "]");
                if (minDiapason == maxDiapason){
                    System.out.println("wait...\nminDiapason = maxDiapason = " + myNumber);
                    System.out.println("then the number must be..." + myNumber + "?!");
                    haswon = true;
                    break;
                }
            }

            else {
                haswon = true;
                break;
            }
        }
        if (haswon) {
            System.out.println("\nCorrect! It's " + myNumber + "!!!");
        }
        else {
            System.out.println("\nGame over... The number was " + myNumber);
        }
    }
/*
    public void compare(int a, int b){

    }
*/
}
