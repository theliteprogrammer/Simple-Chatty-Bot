import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read an integer from standard input */
        int number = scanner.nextInt();
        /* check if it falls within a specific range */
        if (number > -15 && number <= 12) {
            System.out.println("True");
        } else if (number > 14 && number < 17) {
            System.out.println("True");
        } else if (number >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}