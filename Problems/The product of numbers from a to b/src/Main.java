import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        long sum = 1;

        for (int i = number1; i < number2; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}