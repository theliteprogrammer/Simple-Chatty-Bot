import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in an integer from the standard input stream */
        int number = scanner.nextInt();
        /* apply the number to the arithmetic expression */
        int result = ((number + 1) * number + 2) * number + 3;
        System.out.println(result);
    }
}