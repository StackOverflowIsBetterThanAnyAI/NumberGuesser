import java.util.Scanner;

public class CheckFinish {
    public static boolean isFinished(int num, int ran) {
        return num == ran;
    }

    public static int checkIfFinish(int argsNum, int random, int tryCounter, Scanner scanner) {
        while (true) {
            try {
                if (isFinished(argsNum, random)) {
                    return tryCounter;
                }

                int difference = Math.abs(argsNum - random);

                if (difference <= 5) {
                    System.out.println("You are very close to guessing the correct number. (+/- 5)");
                } else if (difference <= 10) {
                    System.out.println("You are quite close to guessing the correct number. (+/- 10)");
                } else if (difference <= 15) {
                    System.out.println("You are close to guessing the correct number. (+/- 15)");
                } else if (difference <= 25) {
                    System.out.println("You are quite far away from guessing the correct number. (+/- 25)");
                } else {
                    System.out.println("You are not even remotely close to guessing the correct number.");
                }

                System.out.println("Please try again.");

                String input = scanner.nextLine().trim();
                int number = Integer.parseInt(input);

                if (number < 0 || number > 100) {
                    throw new Exception("Please enter a number between 0 and 100.");
                }

                tryCounter++;
                return checkIfFinish(number, random, tryCounter, scanner);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
