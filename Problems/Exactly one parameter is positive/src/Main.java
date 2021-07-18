import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean case1 = number1 > 0 && number2 <= 0 && number3 <= 0;
        boolean case2 = number1 <= 0 && number2 > 0 && number3 <= 0;
        boolean case3 = number1 <= 0 && number2 <= 0 && number3 > 0;

        boolean result = case1 || case2 || case3;

        System.out.println(result);

    }
}