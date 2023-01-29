import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in two integer values from standard input stream */
        int valueA = scanner.nextInt();
        int valueB = scanner.nextInt();
        for (int c = valueA; c <= valueB; c++) {
            if (c % 3 == 0 && c % 5 == 0)  {
                System.out.println("FizzBuzz");
            } else if (c % 3 == 0) {
                System.out.println("Fizz");
            } else if (c % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(c);
            }
        }
    }
}