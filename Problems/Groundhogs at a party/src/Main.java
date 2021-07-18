import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean weekdays = cups >= 10 && cups <= 20 && isWeekend == false;
        boolean weekend = cups >= 15 && cups <= 25 && isWeekend == true;

        boolean result = weekdays || weekend;

        System.out.println(result);
    }
}