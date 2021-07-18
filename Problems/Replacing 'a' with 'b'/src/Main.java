import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();

        String result = word1.replace("a", "b");
        System.out.println(result);

    }
}