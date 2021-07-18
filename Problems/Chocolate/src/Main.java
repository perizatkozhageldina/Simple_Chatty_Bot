import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int segments = scanner.nextInt();

        boolean check1 = segments >= length && segments >= width && segments <= length * width;
        boolean check2 = segments % width == 0 || segments % length == 0;

        if (check1 && check2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}