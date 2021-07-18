import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        String word1After = word1.replace(" ", "").trim();
        String word2After = word2.replace(" ", "").trim();

        boolean result = word1After.equals(word2After);
        System.out.println(result);
    }
}