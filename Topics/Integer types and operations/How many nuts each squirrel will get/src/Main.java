import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in two integers, N squirrels and K nuts from standard input */
        int numberOfSquirrels = scanner.nextInt();
        int numberOfNuts = scanner.nextInt();
        /* divide the nuts equally amongst all squirrels */
        int totalNuts = numberOfNuts / numberOfSquirrels;
        /* output the number of nuts each squirrel will get */
        System.out.println(totalNuts);
    }
}