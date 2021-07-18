import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();

        int startTime = hour1 * 60 * 60 + minute1 * 60 + second1;
        int endTime = hour2 * 60 * 60 + minute2 * 60 + second2;
        int result = endTime - startTime;
        System.out.println(result);
    }
}