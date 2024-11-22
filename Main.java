import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new Exception("Error! You must provide one single number between 0 and 100!");
            }
            int argsNum = Integer.parseInt(args[0]);
            int random = (int) (Math.random() * 100);
            int tryCounter = 1;

            if (argsNum < 0 || argsNum > 100) {
                throw new Exception("Error! You must provide a number between 0 and 100!");
            }

            // System.out.println(random);

            Scanner scanner = new Scanner(System.in);
            int tries = CheckFinish.checkIfFinish(argsNum, random, tryCounter, scanner);
            scanner.close();

            System.out.println(
                    "You win! The random number was " + random + ". It took you " + tries + " tries.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
