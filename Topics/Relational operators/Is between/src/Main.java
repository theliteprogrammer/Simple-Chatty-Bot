import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in 3 integer values */
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        /* check if the first number is between the second and the third one (inclusive). */
        boolean secondToLast = firstNumber >= secondNumber && firstNumber <= thirdNumber;
        boolean lastToSecond = firstNumber >= thirdNumber && firstNumber <= secondNumber;
        boolean isBetween = secondToLast || lastToSecond;
        System.out.println(isBetween);
    }
}