import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in 3 integers: N, M, K */
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int segments = scanner.nextInt();
        /* check if it is possible to break the chocolate in segments vertically or horizontally */
        if ((segments % length == 0 || segments % width == 0) && (length * width >= segments)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}