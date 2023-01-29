import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in an integer */
        int number = scanner.nextInt();
        /* check if this number is than 10 */
        boolean lessThan10 = number < 10;
        /* print out the truth value */
        System.out.println(lessThan10);
    }
}