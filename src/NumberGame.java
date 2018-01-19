import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        IGuess iGuess = new IGuess();
        ComputerGuess CGuess = new ComputerGuess();
        System.out.println("do you want to guess number (press 1) or do you want conputer to guess your number (press 2)?");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        if (c == 1)
            iGuess.game();
        else
            CGuess.CompGuess();

    }

}
