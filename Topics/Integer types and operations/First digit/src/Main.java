import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* get user input and store it */
        int number = scanner.nextInt();
        int numberOfTens = number / 10;
        System.out.println(numberOfTens);
    }
}