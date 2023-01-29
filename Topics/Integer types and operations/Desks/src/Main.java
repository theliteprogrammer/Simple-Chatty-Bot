import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in numbers in the range 0-1000 */
        int groupA = scanner.nextInt();
        int groupB = scanner.nextInt();
        int groupC = scanner.nextInt();
        /* check if all inputs are divisible by 2 so that we can compensate for single students */
        int groupARemainder = groupA % 2;
        int groupBRemainder = groupB % 2;
        int groupCRemainder = groupC % 2;
        /* calculate the minimum number of desks */
        int totalRemainders = groupARemainder + groupBRemainder + groupCRemainder;
        int totalStudents = groupA + groupB + groupC;
        int totalDesks = (totalStudents + totalRemainders) / 2;
        /* display the total number of desks required */
        System.out.println(totalDesks);
    }
}