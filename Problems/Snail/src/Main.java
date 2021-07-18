import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int days = 0;
        int res = 0;

        while (res <= height) {
            res = res + up;
            if (res >= height) {
                days++;
                break;
            } else {
                res = res - down;
            }
            days++;
        }

        System.out.println(days);
    }
}