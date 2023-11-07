import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IGuess iGuess = new IGuess();
        ComputerGuess compGuess = new ComputerGuess();
        System.out.println(
                "do you want to guess number (press 1) or do you want conputer to guess your number (press 2)?");

        int c = scanner.nextInt();
        if (c == 1)
            iGuess.game();
        else
            compGuess.CompGuess();

        scanner.close();
    }
}
