import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        boolean result = word.charAt(0);
        System.out.print(result);
    }
}