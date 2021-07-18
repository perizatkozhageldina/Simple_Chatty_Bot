import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerEdge = scanner.nextInt();
        int higherEdge = scanner.nextInt();
        int timeAnna = scanner.nextInt();

        if (timeAnna < lowerEdge) {
            System.out.println("Deficiency");
        } else if (timeAnna > higherEdge) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}