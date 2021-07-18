import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();

        int amount1 = students1 / 2 + students1 % 2;
        int amount2 = students2 / 2 + students2 % 2;
        int amount3 = students3 / 2 + students3 % 2;

        System.out.println(amount1 + amount2 + amount3);

    }
}